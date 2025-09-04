// Tags: DFS
package com.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class MaxAreaOfIsland695 {
    private int dfs(int r, int c, int[][] grid, Set<String> visited) {
        String key = r + ";" + c;
        if (r < 0 || r == grid.length || c < 0 || c == grid[0].length || visited.contains(key) || grid[r][c] == 0) {
            return 0;
        }
        visited.add(key);
        return 1 + this.dfs(r + 1, c, grid, visited) + this.dfs(r - 1, c, grid, visited) + this.dfs(r, c + 1, grid, visited) + this.dfs(r, c - 1, grid, visited);
    }

    /*
        Time complexity: O(R∗C), where R is the number of rows in the given grid, and C is the number of columns.
        We visit every square once.

        Space complexity: O(R∗C),
        the space used by visited to keep track of visited squares and the space used by the call stack during our recursion.
     */
    public int maxAreaOfIsland(int[][] grid) {
        Set<String> visited = new HashSet<>();
        int res = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                res = Math.max(res, this.dfs(r, c, grid, visited));
            }
        }
        return res;
    }
}
