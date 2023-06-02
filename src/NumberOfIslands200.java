// Array, Depth-First Search, Breadth-First Search, Union Find, Matrix

import java.util.HashSet;

public class NumberOfIslands200 {
    /*
        m = # of rows, n = # of cols
        Time Complexity: O(mn)
        Space Complexity: O(mn)
    */
    private boolean dfs(int r, int c, char[][] grid, HashSet<String> visited) {
        String key = r + "," + c;
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

    public int numIslands(char[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int res = 0;
        HashSet<String> visited = new HashSet<>();
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (this.dfs(r, c, grid, visited)) {
                    res += 1;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        char[][] grid = {{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
        System.out.println(new NumberOfIslands200().numIslands(grid));
    }
}
