# JUnit 5 assertTimeoutPreemptively 完整说明文档

## 目录
1. [基本概念](#基本概念)
2. [方法签名与参数](#方法签名与参数)
3. [核心原理：抢占式终止](#核心原理抢占式终止)
4. [与 assertTimeout 的区别](#与-asserttimeout-的区别)
5. [技术实现原理](#技术实现原理)
6. [使用示例](#使用示例)
7. [注意事项与限制](#注意事项与限制)
8. [最佳实践](#最佳实践)
9. [常见问题](#常见问题)

---

## 基本概念

`assertTimeoutPreemptively` 是 JUnit 5 (JUnit Jupiter) 提供的断言方法，用于确保被测试代码在**指定时间内**执行完成。如果超时，测试将**立即失败**。

**核心特性**：
- 在**独立线程**中执行测试代码
- 超时后**立即中断**执行（抢占式）
- 返回被测试代码的执行结果

**Maven 依赖**：
```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.10.0</version>
    <scope>test</scope>
</dependency>
```

**导入语句**：
```java
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
```

---

## 方法签名与参数

### 常用重载方法

```java
// 1. 执行并返回结果
<T> T assertTimeoutPreemptively(Duration timeout, ThrowingSupplier<T> supplier)

// 2. 执行但不返回结果
void assertTimeoutPreemptively(Duration timeout, Executable executable)

// 3. 带自定义失败消息
<T> T assertTimeoutPreemptively(Duration timeout, ThrowingSupplier<T> supplier, String message)

// 4. 带自定义失败消息（Supplier）
<T> T assertTimeoutPreemptively(Duration timeout, ThrowingSupplier<T> supplier, Supplier<String> messageSupplier)
```

### 参数说明

| 参数 | 类型 | 说明 |
|------|------|------|
| `timeout` | `Duration` | 超时时间限制 |
| `executable` | `Executable` | 需要执行的代码（无返回值） |
| `supplier` | `ThrowingSupplier<T>` | 需要执行的代码（有返回值） |
| `message` | `String` | 测试失败时的自定义消息 |

### Duration 常用方法

```java
Duration.ofMillis(100)    // 100 毫秒
Duration.ofSeconds(2)     // 2 秒
Duration.ofMinutes(1)     // 1 分钟
Duration.ofNanos(500000)  // 500,000 纳秒
```

---

## 核心原理：抢占式终止

### 执行流程图

```
主测试线程                     工作线程
    |                            |
    |---> 创建新线程 ----------> 开始执行 executable
    |                            |
    |---> 等待 (100ms)           |
    |                            |
    | [情况1: 正常完成]          |
    |                            |--> 返回结果
    |<--- 接收结果 <-------------|
    |
    | [情况2: 超时]
    |                            |--> 仍在执行
    | (100ms 到期)               |
    |                            |
    |---> 发送中断信号 --------> X (线程被终止)
    |
    |---> 抛出 AssertionFailedError
```

### 关键步骤

1. **启动新线程**：在独立线程中执行被测试代码
2. **并发监控**：主线程等待指定的超时时间
3. **结果处理**：
   - **正常完成**：返回执行结果，测试通过
   - **超时**：立即调用 `Thread.interrupt()` 中断线程
4. **异常抛出**：超时时抛出 `AssertionFailedError`

### 线程中断机制

```java
// 工作线程被中断时
try {
    // 执行代码
} catch (InterruptedException e) {
    // 如果代码响应中断，会捕获此异常
    Thread.currentThread().interrupt();
}
```

---

## 与 assertTimeout 的区别

JUnit 5 提供两种超时断言：

### 对比表格

| 特性 | `assertTimeout` | `assertTimeoutPreemptively` |
|------|-----------------|----------------------------|
| **执行线程** | 同一线程 | 新线程（独立） |
| **超时处理** | 等待执行完成后才报告失败 | 立即中断执行 |
| **实际执行时间** | 可能远超设定时间 | 最多 = 超时时间 + 线程开销 |
| **资源清理** | 保证执行完成 | 可能未完成清理 |
| **ThreadLocal** | 可访问主线程 ThreadLocal | 无法访问（不同线程） |
| **事务上下文** | 共享测试事务 | 无法共享事务 |
| **性能开销** | 低 | 高（创建线程） |
| **适用场景** | 需要资源清理、事务管理 | 纯计算、严格时间控制 |

### 代码示例对比

```java
@Test
void testWithAssertTimeout() {
    // 如果 slowMethod() 需要 5 秒执行
    // 测试会在 5 秒后失败
    assertTimeout(Duration.ofMillis(100), () -> {
        slowMethod(); // 实际执行 5000ms
    });
    // 测试总耗时: ~5000ms
}

@Test
void testWithAssertTimeoutPreemptively() {
    // 如果 slowMethod() 需要 5 秒执行
    // 测试会在 100ms 时立即终止
    assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
        slowMethod(); // 最多执行 100ms
    });
    // 测试总耗时: ~100ms
}
```

### 何时使用哪个？

**使用 `assertTimeout`（非抢占式）**：
- 需要完整的资源清理（文件、连接）
- 依赖 Spring 事务或 ThreadLocal
- 只需验证性能，允许完整执行

**使用 `assertTimeoutPreemptively`（抢占式）**：
- 测试纯计算算法（如本项目的爬楼梯问题）
- 需要严格控制测试套件总时间
- 防止死循环或指数级复杂度卡死测试

---

## 技术实现原理

### JUnit 5 内部实现（简化版）

```java
public class Assertions {
    public static <T> T assertTimeoutPreemptively(
            Duration timeout,
            ThrowingSupplier<T> supplier) {

        // 1. 创建单线程执行器
        ExecutorService executor = Executors.newSingleThreadExecutor(
            threadFactory -> {
                Thread thread = new Thread(threadFactory);
                thread.setDaemon(true); // 设为守护线程
                return thread;
            }
        );

        // 2. 提交任务到新线程
        Future<T> future = executor.submit(() -> {
            try {
                return supplier.get();
            } catch (Throwable t) {
                throw new ExecutionException(t);
            }
        });

        try {
            // 3. 等待结果（带超时）
            return future.get(timeout.toMillis(), TimeUnit.MILLISECONDS);

        } catch (TimeoutException e) {
            // 4. 超时处理：取消任务并中断线程
            future.cancel(true); // mayInterruptIfRunning = true

            throw new AssertionFailedError(
                String.format("执行超时 (%s 毫秒)", timeout.toMillis())
            );

        } catch (ExecutionException e) {
            // 5. 执行异常处理
            throw new AssertionFailedError("执行过程中抛出异常", e.getCause());

        } catch (InterruptedException e) {
            // 6. 主线程被中断
            Thread.currentThread().interrupt();
            throw new AssertionFailedError("测试被中断");

        } finally {
            // 7. 关闭执行器
            executor.shutdownNow();
        }
    }
}
```

### 关键技术点

1. **ExecutorService**：使用线程池管理工作线程
2. **Future.get(timeout)**：阻塞等待结果，支持超时
3. **future.cancel(true)**：`true` 参数表示允许中断正在运行的线程
4. **守护线程**：确保 JVM 可以正常退出
5. **shutdownNow()**：强制关闭执行器，尝试停止所有任务

---

## 使用示例

### 示例 1：ClimbingStairs70Test（项目实际应用）

```java
@Test
void testClimbStairsMemoization_Example3() {
    int n = 38;
    int expected = 63245986;

    // 确保记忆化算法在 100ms 内完成
    int result = assertTimeoutPreemptively(
        Duration.ofMillis(100),
        () -> solution.climbStairsMemoization(n)
    );

    assertEquals(expected, result);
}
```

**目的**：
- 验证动态规划算法的时间复杂度是 O(n)
- 如果使用暴力递归（O(2^n)），n=38 时会超时失败
- 保证测试套件不会因低效算法卡死

### 示例 2：无返回值的执行

```java
@Test
void testPrintNumbers() {
    assertTimeoutPreemptively(Duration.ofSeconds(1), () -> {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    });
}
```

### 示例 3：带自定义失败消息

```java
@Test
void testDatabaseQuery() {
    String result = assertTimeoutPreemptively(
        Duration.ofSeconds(2),
        () -> database.query("SELECT * FROM users"),
        "数据库查询超时，检查索引配置"
    );

    assertNotNull(result);
}
```

### 示例 4：嵌套断言

```java
@Test
void testMultipleOperations() {
    assertTimeoutPreemptively(Duration.ofSeconds(5), () -> {
        int result1 = heavyComputation1();
        assertEquals(100, result1);

        int result2 = heavyComputation2();
        assertEquals(200, result2);
    });
}
```

---

## 注意事项与限制

### ⚠️ 1. 线程安全问题

**问题**：被测试代码在不同线程运行，无法访问主线程的 ThreadLocal 变量。

```java
// ❌ 错误示例
ThreadLocal<String> context = ThreadLocal.withInitial(() -> "main");

@Test
void testThreadLocal() {
    context.set("测试上下文");

    assertTimeoutPreemptively(Duration.ofSeconds(1), () -> {
        // 这里无法访问 "测试上下文"，会得到 "main"
        String value = context.get();
        assertEquals("测试上下文", value); // 失败！
    });
}
```

### ⚠️ 2. 资源清理风险

**问题**：超时中断可能导致资源未正确释放。

```java
// ❌ 危险示例
@Test
void testFileOperation() {
    assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
        FileInputStream fis = new FileInputStream("large-file.txt");
        byte[] buffer = new byte[1024];

        while (fis.read(buffer) != -1) {
            // 如果超时，fis 可能无法关闭！
            processData(buffer);
        }

        fis.close(); // 可能永远不会执行
    });
}

// ✅ 推荐做法
@Test
void testFileOperationSafe() {
    assertTimeout(Duration.ofMillis(100), () -> {
        try (FileInputStream fis = new FileInputStream("large-file.txt")) {
            // try-with-resources 保证关闭
            byte[] buffer = new byte[1024];
            while (fis.read(buffer) != -1) {
                processData(buffer);
            }
        }
    });
}
```

### ⚠️ 3. Spring 事务问题

**问题**：Spring 测试事务绑定到线程，新线程无法访问事务上下文。

```java
// ❌ 错误示例
@SpringBootTest
@Transactional
class UserServiceTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void testSaveUser() {
        assertTimeoutPreemptively(Duration.ofSeconds(1), () -> {
            User user = new User("test");
            userRepository.save(user); // 事务上下文丢失！
        });
    }
}

// ✅ 推荐做法：使用 assertTimeout
@Test
void testSaveUserCorrect() {
    assertTimeout(Duration.ofSeconds(1), () -> {
        User user = new User("test");
        userRepository.save(user); // 正确使用事务
    });
}
```

### ⚠️ 4. 中断处理限制

**问题**：如果代码不响应中断，可能无法真正终止。

```java
// ❌ 无法中断的代码
@Test
void testInfiniteLoop() {
    assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
        while (true) {
            // 不检查中断状态，线程可能无法终止
            doSomething();
        }
    });
}

// ✅ 响应中断的代码
@Test
void testInterruptibleLoop() {
    assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
        while (!Thread.currentThread().isInterrupted()) {
            // 定期检查中断状态
            doSomething();
        }
    });
}
```

### ⚠️ 5. 性能开销

创建线程有固定开销（通常 1-5ms），不适合大量微小测试。

```java
// ❌ 不推荐：为简单断言创建线程
@Test
void testSimpleAddition() {
    int result = assertTimeoutPreemptively(
        Duration.ofSeconds(1),
        () -> 1 + 1  // 过于简单，线程开销不值得
    );
    assertEquals(2, result);
}

// ✅ 推荐：直接测试
@Test
void testSimpleAdditionCorrect() {
    assertEquals(2, 1 + 1);
}
```

---

## 最佳实践

### ✅ 1. 明确使用场景

**适合使用 `assertTimeoutPreemptively` 的场景**：
- 纯计算算法（无外部依赖）
- 需要严格控制测试时间
- 测试算法时间复杂度
- 防止死循环或递归栈溢出

**示例**：
```java
@Test
void testSortingAlgorithm() {
    int[] largeArray = generateRandomArray(100000);

    int[] sorted = assertTimeoutPreemptively(
        Duration.ofSeconds(1),
        () -> quickSort(largeArray) // 纯计算
    );

    assertTrue(isSorted(sorted));
}
```

### ✅ 2. 合理设置超时时间

```java
// ❌ 太宽松：失去意义
assertTimeoutPreemptively(Duration.ofMinutes(10), () -> fastMethod());

// ❌ 太严格：容易误报
assertTimeoutPreemptively(Duration.ofMillis(1), () -> normalMethod());

// ✅ 合理：2-3 倍预期时间
// 如果算法预期 30ms，设置 100ms 超时
assertTimeoutPreemptively(Duration.ofMillis(100), () -> algorithm());
```

### ✅ 3. 添加有意义的失败消息

```java
@Test
void testComplexAlgorithm() {
    assertTimeoutPreemptively(
        Duration.ofSeconds(2),
        () -> algorithm.process(data),
        () -> String.format(
            "算法超时！输入大小: %d, 预期时间: O(n log n)",
            data.size()
        )
    );
}
```

### ✅ 4. 与性能分析结合

```java
@Test
void testPerformanceRegression() {
    long startTime = System.nanoTime();

    int result = assertTimeoutPreemptively(
        Duration.ofMillis(100),
        () -> solution.compute(input)
    );

    long duration = System.nanoTime() - startTime;
    System.out.printf("执行时间: %.2f ms%n", duration / 1_000_000.0);

    assertEquals(expected, result);
}
```

### ✅ 5. 在 CI/CD 中使用

```java
// 在 CI 环境中适当放宽时间限制
@Test
void testInCIEnvironment() {
    Duration timeout = isCI()
        ? Duration.ofSeconds(5)  // CI 环境较慢
        : Duration.ofSeconds(1); // 本地开发

    assertTimeoutPreemptively(timeout, () -> algorithm.run());
}

private boolean isCI() {
    return System.getenv("CI") != null;
}
```

---

## 常见问题

### Q1: 为什么我的测试在 IntelliJ IDEA 中通过，但在命令行失败？

**A**: 可能是 CI 环境性能不同。建议：
```java
// 使用系统属性调整超时
int timeoutMs = Integer.parseInt(
    System.getProperty("test.timeout", "100")
);
assertTimeoutPreemptively(Duration.ofMillis(timeoutMs), ...);
```

### Q2: 如何调试 `assertTimeoutPreemptively` 中的代码？

**A**: 两种方法：
1. 临时改用 `assertTimeout`（允许打断点）
2. 增加超时时间，给调试留出空间

```java
@Test
void testWithDebugging() {
    // 调试时改为 10 秒
    assertTimeoutPreemptively(Duration.ofSeconds(10), () -> {
        // 在这里打断点
        int result = algorithm.compute();
        return result;
    });
}
```

### Q3: 如何测试预期会超时的代码？

**A**: 使用 `assertThrows`：
```java
@Test
void testExpectedTimeout() {
    assertThrows(AssertionFailedError.class, () -> {
        assertTimeoutPreemptively(Duration.ofMillis(10), () -> {
            Thread.sleep(1000); // 故意超时
        });
    });
}
```

### Q4: 能在 JUnit 4 中使用吗？

**A**: 不能，这是 JUnit 5 专属功能。JUnit 4 需要使用 `@Test(timeout=100)` 注解：
```java
// JUnit 4 方式（非抢占式）
@Test(timeout = 100)
public void testTimeout() {
    // 测试代码
}
```

### Q5: 为什么有时候超时时间不准确？

**A**: 线程调度有开销，实际超时时间可能有 ±5-10ms 的误差。不要依赖毫秒级精度。

---

## 总结

`assertTimeoutPreemptively` 是 JUnit 5 强大的超时断言工具，通过**独立线程**和**抢占式中断**机制，确保测试在严格时间限制内完成。

**核心优势**：
- 真正的超时控制（立即终止）
- 防止测试套件卡死
- 验证算法时间复杂度

**核心限制**：
- 线程隔离（ThreadLocal、事务问题）
- 资源清理风险
- 性能开销

**选择建议**：
- 纯计算、算法测试 → `assertTimeoutPreemptively` ✅
- 资源操作、事务测试 → `assertTimeout` ✅

---

## 参考资料

- [JUnit 5 官方文档](https://junit.org/junit5/docs/current/user-guide/)
- [JUnit 5 API 文档](https://junit.org/junit5/docs/current/api/)
- ClimbingStairs70Test.java (本项目示例)

---

**文档版本**: 1.0
**最后更新**: 2025-10-30
**适用于**: JUnit 5.x (Jupiter)
