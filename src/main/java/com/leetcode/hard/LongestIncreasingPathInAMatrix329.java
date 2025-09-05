// Tags: Matrix, DFS, Dynamic Programming, Graph
package com.leetcode.hard;

public class LongestIncreasingPathInAMatrix329 {
    private int dfs(int r, int c, int prevVal, int[][] matrix, int[][] memo) {
        if (r < 0 || r == matrix.length || c < 0 || c == matrix[0].length || matrix[r][c] <= prevVal) {
            return 0;
        }
        if (memo[r][c] != 0) {
            return memo[r][c];
        }
        memo[r][c] = (1 + Math.max(Math.max(
                        this.dfs(r + 1, c, matrix[r][c], matrix, memo),
                        this.dfs(r - 1, c, matrix[r][c], matrix, memo)),
                Math.max(
                        this.dfs(r, c + 1, matrix[r][c], matrix, memo),
                        this.dfs(r, c - 1, matrix[r][c], matrix, memo))));
        return memo[r][c];
    }

    /*
        Time complexity: O(mn).
        Each vertex/cell will be calculated once and only once,
        and each edge will be visited once and only once.
        The total time complexity is then O(V+E).
        V is the total number of vertices and E is the total number of edges.
        In our problem, O(V)=O(mn), O(E)=O(4V)=O(mn).

        Space complexity: O(mn). The cache dominates the space complexity.
     */
    public int longestIncreasingPath(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] memo = new int[rows][cols];
        int res = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                res = Math.max(res, this.dfs(r, c, -1, matrix, memo));
            }
        }
        return res;
    }
}
