// Math, Dynamic Programming, Recursion, Memoization

import java.util.Map;
import java.util.HashMap;

public class FibonacciNumber509 {
    private int dfs(int n, Map<Integer, Integer> memo) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        memo.put(n, this.dfs(n - 1, memo) + this.dfs(n - 2, memo));
        return memo.get(n);
    }

    public int fibMemoization(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return this.dfs(n, memo);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(new FibonacciNumber509().fibMemoization(n)); // 3
    }
}
