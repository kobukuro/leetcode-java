public class MaximalSquare221 {
    public int maximalSquare(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] dp = new int[rows + 1][cols + 1];
        int maxEdge = 0;
        for (int r = 1; r < rows + 1; r++) {
            for (int c = 1; c < cols + 1; c++) {
                if (matrix[r - 1][c - 1] == '1') {
                    dp[r][c] = Math.min(Math.min(dp[r - 1][c], dp[r][c - 1]), dp[r - 1][c - 1]) + 1;
                    maxEdge = Math.max(maxEdge, dp[r][c]);
                }
            }
        }
        return maxEdge * maxEdge;
    }

    public int OptimizedMaximalSquare(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] dp = new int[cols + 1];
        int maxEdge = 0;
        int prev = 0;
        for (int r = 1; r < rows + 1; r++) {
            for (int c = 1; c < cols + 1; c++) {
                int temp = dp[c];
                if (matrix[r - 1][c - 1] == '1') {
                    dp[c] = Math.min(Math.min(dp[c], dp[c - 1]), prev) + 1;
                    maxEdge = Math.max(maxEdge, dp[c]);
                } else {
                    dp[c] = 0;
                }
                prev = temp;
            }
        }
        return maxEdge * maxEdge;
    }

    public static void main(String[] args) {
        MaximalSquare221 solution = new MaximalSquare221();
        char[][] matrix = {
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'0', '0', '0', '0', '0'},
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '1'}
        };
        System.out.println(solution.maximalSquare(matrix)); // Output: 4
        System.out.println(solution.OptimizedMaximalSquare(matrix)); // Output: 4
    }
}
