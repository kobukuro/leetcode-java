// Tags: Backtracking, DFS
package com.leetcode.medium;

public class WordSearch79 {
    private boolean dfs(int r, int c, char[][] board, String word, int index, boolean[][] visited) {
        if (index == word.length()) {
            return true;
        }
        if (r < 0 || r == board.length || c < 0 || c == board[0].length || visited[r][c] || word.charAt(index) != board[r][c]) {
            return false;
        }
        visited[r][c] = true;
        if (this.dfs(r + 1, c, board, word, index + 1, visited) || this.dfs(r - 1, c, board, word, index + 1, visited) || this.dfs(r, c + 1, board, word, index + 1, visited) || this.dfs(r, c - 1, board, word, index + 1, visited)) {
            return true;
        }
        visited[r][c] = false;
        return false;
    }
    /*
        w: length of word
        Time complexity: O(m*n*4^w)
        Space complexity: O(w)
     */
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (this.dfs(r, c, board, word, 0, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}
