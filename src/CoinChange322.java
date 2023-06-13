// Dynamic Programming, Array, Depth-First Search

import java.util.HashMap;
import java.util.Map;

public class CoinChange322 {
    private int dfs(int[] coins, int amount, Map<Integer, Integer> memo) {
        if (memo.containsKey(amount)) {
            return memo.get(amount);
        }
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return Integer.MAX_VALUE;
        }
        int res = Integer.MAX_VALUE;
        for (int coin : coins) {
            res = Math.min(res, this.dfs(coins, amount - coin, memo));
        }
        if (res == Integer.MAX_VALUE) {
            memo.put(amount, res);
            return res;
        } else {
            memo.put(amount, 1 + res);
            return 1 + res;
        }
    }

    /*
        c:length of coins array, a:target amount
        Time Complexity : O(a*c),
        Space Complexity : O(a)
        due to the call stack, and we will store at most "a" different keys in memo hashmap
     */
    public int coinChangeMemoization(int[] coins, int amount) {
        int res = this.dfs(coins, amount, new HashMap<>());
        if (res == Integer.MAX_VALUE) {
            return -1;
        } else {
            return res;
        }
    }

    public static void main(String[] args) {
        int[] coins = new int[]{1, 2, 5};
        int amount = 11;
        System.out.println(new CoinChange322().coinChangeMemoization(coins, amount)); // 3
    }
}
