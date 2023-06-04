// Array, Depth-First Search, Breadth-First Search, Union Find, Matrix

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PacificAtlanticWaterFlow417 {
    /*
        Time complexity: O(M*N),
        where M is the number of rows and N is the number of columns.
        The dfs function runs exactly once for each cell accessible from an ocean.

        Space complexity: O(M*N),
        where M is the number of rows and N is the number of columns.
        Space is occupied by dfs calls on the recursion stack.
     */
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        Set<SimpleEntry<Integer, Integer>> pac = new HashSet<>();
        Set<SimpleEntry<Integer, Integer>> atl = new HashSet<>();

        for (int c = 0; c < cols; c++) {
            dfs(0, c, heights, pac, heights[0][c]);
            dfs(rows - 1, c, heights, atl, heights[rows - 1][c]);
        }
        for (int r = 0; r < rows; r++) {
            dfs(r, 0, heights, pac, heights[r][0]);
            dfs(r, cols - 1, heights, atl, heights[r][cols - 1]);
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                SimpleEntry<Integer, Integer> point = new SimpleEntry<>(r, c);
                if (pac.contains(point) && atl.contains(point)) {
                    List<Integer> coordinate = new ArrayList<>();
                    coordinate.add(r);
                    coordinate.add(c);
                    res.add(coordinate);
                }
            }
        }
        return res;
    }

    private void dfs(int r, int c, int[][] heights, Set<SimpleEntry<Integer, Integer>> visited, int prevHeight) {
        int rows = heights.length;
        int cols = heights[0].length;

        if (r < 0 || r == rows || c < 0 || c == cols || heights[r][c] < prevHeight || visited.contains(new SimpleEntry<>(r, c))) {
            return;
        }

        visited.add(new SimpleEntry<>(r, c));
        dfs(r + 1, c, heights, visited, heights[r][c]);
        dfs(r - 1, c, heights, visited, heights[r][c]);
        dfs(r, c + 1, heights, visited, heights[r][c]);
        dfs(r, c - 1, heights, visited, heights[r][c]);
    }

    public static void main(String[] args) {
        int[][] heights = {{1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}};
        System.out.println(new PacificAtlanticWaterFlow417().pacificAtlantic(heights));
        // [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
    }
}
