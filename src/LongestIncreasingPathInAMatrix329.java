import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongestIncreasingPathInAMatrix329 {
    private int dfs(int r, int c, int prevVal, int[][] matrix, Map<String, Integer> dp) {
        if (r < 0 || r == matrix.length || c < 0 || c == matrix[0].length || matrix[r][c] <= prevVal) {
            return 0;
        }
        String key = r + "," + c;
        if (dp.containsKey(key)) {
            return dp.get(key);
        }
        int res = 1;
        res = Math.max(res, 1 + this.dfs(r + 1, c, matrix[r][c], matrix, dp));
        res = Math.max(res, 1 + this.dfs(r - 1, c, matrix[r][c], matrix, dp));
        res = Math.max(res, 1 + this.dfs(r, c + 1, matrix[r][c], matrix, dp));
        res = Math.max(res, 1 + this.dfs(r, c - 1, matrix[r][c], matrix, dp));
        dp.put(key, res);
        return res;
    }

    public int longestIncreasingPath(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        Map<String, Integer> dp = new HashMap<>();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                this.dfs(r, c, -1, matrix, dp);
            }
        }
        return Collections.max(dp.values());
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {9, 9, 4},
            {6, 6, 8},
            {2, 1, 1}
        };
        System.out.println(new LongestIncreasingPathInAMatrix329().longestIncreasingPath(matrix)); // Output: 4
        int[][] matrix2 = {
            {3, 4, 5},
            {3, 2, 6},
            {2, 2, 1}
        };
        System.out.println(new LongestIncreasingPathInAMatrix329().longestIncreasingPath(matrix2)); // Output: 4
    }
}
