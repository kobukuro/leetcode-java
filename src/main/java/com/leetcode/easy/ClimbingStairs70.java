// Tags: Memoization, Dynamic Programming
package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs70 {
    private int dfs(int n, Map<Integer, Integer> memo) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        memo.put(n, this.dfs(n - 1, memo) + this.dfs(n - 2, memo));
        return memo.get(n);
    }

    /*
        Time complexity: O(n). Size of recursion tree can go up to n.
        Space complexity: O(n). The depth of the recursion tree can go up to n.
     */
    public int climbStairsMemoization(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return this.dfs(n, memo);
    }

    /*
        Time complexity: O(n). Single loop up to n.
        Space complexity: O(n). dp array of size n is used.
     */
    public int climbStairsTabulation(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
