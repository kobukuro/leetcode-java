// Tags: Backtracking, DFS
package com.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class WordSearch79 {
    private boolean dfs(int r, int c, char[][] board, String word, int index, Set<String> visited) {
        String key = r + ";" + c;
        if (index == word.length()) {
            return true;
        }
        if (r < 0 || r == board.length || c < 0 || c == board[0].length || visited.contains(key) || word.charAt(index) != board[r][c]) {
            return false;
        }
        visited.add(key);
        if (this.dfs(r + 1, c, board, word, index + 1, visited) || this.dfs(r - 1, c, board, word, index + 1, visited) || this.dfs(r, c + 1, board, word, index + 1, visited) || this.dfs(r, c - 1, board, word, index + 1, visited)) {
            return true;
        }
        visited.remove(key);
        return false;
    }
    /*
        w: length of word
        Time complexity: O(m*n*4^w)
        Space complexity: O(w)
     */
    public boolean exist(char[][] board, String word) {
        Set<String> visited = new HashSet<>();
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
