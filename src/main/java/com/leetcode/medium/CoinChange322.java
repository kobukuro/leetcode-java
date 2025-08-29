// Tags: DFS, Dynamic Programming
package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class CoinChange322 {
    private int dfs(int[] coins, int amount, Map<Integer, Integer> memo) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return Integer.MAX_VALUE;
        }
        if (memo.containsKey(amount)) {
            return memo.get(amount);
        }
        int minVal = Integer.MAX_VALUE;
        for (int coin : coins) {
            minVal = Math.min(minVal, this.dfs(coins, amount - coin, memo));
        }
        if (minVal == Integer.MAX_VALUE) {
            memo.put(amount, minVal);
        } else {
            memo.put(amount, 1 + minVal);
        }
        return memo.get(amount);
    }

    /*
        C: length of coins array, A: target amount
        Time complexity: O(A*C),
        Space complexity: O(A) due to the call stack, and we will store at most "A" different keys in memo HashMap
     */
    public int coinChangeMemoization(int[] coins, int amount) {
        int res = this.dfs(coins, amount, new HashMap<>());
        if (res == Integer.MAX_VALUE) {
            return -1;
        } else {
            return res;
        }
    }

    /*
        C:length of coins array, A:target amount
        Time complexity: O(A*C), C work for A sub problems
        Space complexity: O(A)
     */
    public int coinChangeTabulation(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            dp[i] = amount + 1;
        }
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }
        if (dp[amount] < amount + 1) {
            return dp[amount];
        } else {
            return -1;
        }
    }
}
