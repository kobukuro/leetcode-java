// Math, Dynamic Programming, Memoization

import java.util.HashMap;

public class ClimbingStairs70 {
    /*
        Time Complexity: O(n)
        Space Complexity: O(n)
     */
    public int climbStairsRecursive(int n, HashMap<Integer, Integer> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int res = this.climbStairsRecursive(n - 1, memo) + this.climbStairsRecursive(n - 2, memo);
        memo.put(n, res);
        return memo.get(n);
    }

    public int climbStairsCallRecursive(int n) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        return this.climbStairsRecursive(n, memo);
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(n)
     */
    public int climbStairsTabulation(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(new ClimbingStairs70().climbStairsCallRecursive(n)); // 2
        System.out.println(new ClimbingStairs70().climbStairsTabulation(n)); // 2
    }
}
