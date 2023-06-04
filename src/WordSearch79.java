// Array ,Backtracking, Matrix

import java.util.AbstractMap.SimpleEntry;
import java.util.Set;
import java.util.HashSet;

public class WordSearch79 {
    /*
        w:length of word
        Time Complexity : O(m*n*4^w)
        Space Complexity : O(w)
     */
    public boolean dfs(int r, int c, int index, String word, Set<SimpleEntry<Integer, Integer>> visited, char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        if (index == word.length()) {
            return true;
        }
        if (r < 0 || r == rows || c < 0 || c == cols || visited.contains(new SimpleEntry<>(r, c)) || board[r][c] != word.charAt(index)) {
            return false;
        }
        visited.add(new SimpleEntry<>(r, c));
        if (this.dfs(r + 1, c, index + 1, word, visited, board) || this.dfs(r - 1, c, index + 1, word, visited, board) || this.dfs(r, c + 1, index + 1, word, visited, board) || this.dfs(r, c - 1, index + 1, word, visited, board)) {
            return true;
        }
        visited.remove(new SimpleEntry<>(r, c));
        return false;
    }

    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        Set<SimpleEntry<Integer, Integer>> visited = new HashSet<>();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (this.dfs(r, c, 0, word, visited, board)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        System.out.println(new WordSearch79().exist(board, word));
        // true
    }
}
