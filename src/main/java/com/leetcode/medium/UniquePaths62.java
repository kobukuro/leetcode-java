// Tags: Dynamic Programming, DFS
package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class UniquePaths62 {
    private int uniquePathsMemoizationRecursive(int m, int n, Map<String, Integer> memo) {
        if (m == 1 || n == 1) {
            return 1;
        }
        String key = m + "," + n;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        memo.put(key, this.uniquePathsMemoizationRecursive(m - 1, n, memo) + this.uniquePathsMemoizationRecursive(m, n - 1, memo));
        return memo.get(key);
    }

    /**
     * Time complexity: O(m*n)
     * <p>
     * Space complexity: O(m+n)
     */
    public int uniquePathsMemoization(int m, int n) {
        return this.uniquePathsMemoizationRecursive(m, n, new HashMap<>());
    }

    /**
     * Time complexity: O(m*n)
     * <p>
     * Space complexity: O(m*n)
     */
    public int uniquePathsTabulation(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        dp[1][1] = 1;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i + 1 <= m) dp[i + 1][j] += dp[i][j];
                if (j + 1 <= n) dp[i][j + 1] += dp[i][j];
            }
        }
        return dp[m][n];
    }
}
