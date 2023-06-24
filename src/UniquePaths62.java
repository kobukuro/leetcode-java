// Dynamic Programming, Math, Combinatorics

import java.util.Map;
import java.util.HashMap;

public class UniquePaths62 {
    private int dfs(int m, int n, Map<String, Integer> memo) {
        String key = m + "," + n;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        if (m == 0 || n == 0) {
            return 0;
        }
        if (m == 1 || n == 1) {
            return 1;
        }
        memo.put(key, this.dfs(m - 1, n, memo) + this.dfs(m, n - 1, memo));
        return memo.get(key);
    }

    /*
        Time complexity : O(m*n)
        Space complexity : O(m+n)
     */
    public int uniquePathsMemoization(int m, int n) {
        Map<String, Integer> memo = new HashMap<>();
        return this.dfs(m, n, memo);
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        System.out.println(new UniquePaths62().uniquePathsMemoization(m, n)); // 28
    }
}
