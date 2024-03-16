public class TransposeMatrix867 {
    public int[][] transpose(int[][] matrix) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;
        int[][] res = new int[COLS][ROWS];
        for (int c = 0; c < COLS; c++) {
            for (int r = 0; r < ROWS; r++) {
                res[c][r] = matrix[r][c];
            }
        }
        return res;
    }
}
