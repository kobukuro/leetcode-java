// Tags: DFS
package com.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class NumberOfIslands200 {
    private boolean dfs(int r, int c, char[][] grid, Set<String> visited) {
        String key = r + ";" + c;
        if (r < 0 || r == grid.length || c < 0 || c == grid[0].length || visited.contains(key) || grid[r][c] == '0') {
            return false;
        }
        visited.add(key);
        this.dfs(r + 1, c, grid, visited);
        this.dfs(r - 1, c, grid, visited);
        this.dfs(r, c + 1, grid, visited);
        this.dfs(r, c - 1, grid, visited);
        return true;
    }

    /*
        m = # of rows, n = # of cols
        Time complexity: O(mn)
        Space complexity: O(mn)
     */
    public int numIslands(char[][] grid) {
        int res = 0;
        Set<String> visited = new HashSet<>();
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (this.dfs(r, c, grid, visited)) {
                    res++;
                }
            }
        }
        return res;
    }
}
