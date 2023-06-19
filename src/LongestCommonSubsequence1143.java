// String, Dynamic Programming
public class LongestCommonSubsequence1143 {
    /*
        There are M possible positions for the first string, and N for the second string.
        Time complexity : O(M*N).
        We're solving M*N sub problems. Solving each sub problem is an O(1) operation.

        Space complexity : O(M*N).
        We're allocating a 2D array of size M*N to save the answers to sub problems.
     */
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text2.length() + 1][text1.length() + 1];
        for (int r = 1; r <= text2.length(); r++) {
            for (int c = 1; c <= text1.length(); c++) {
                if (text1.charAt(c - 1) == text2.charAt(r - 1)) {
                    dp[r][c] = 1 + dp[r - 1][c - 1];
                } else {
                    dp[r][c] = Math.max(dp[r - 1][c], dp[r][c - 1]);
                }
            }
        }
        return dp[text2.length()][text1.length()];
    }

    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println(new LongestCommonSubsequence1143().longestCommonSubsequence(text1, text2)); // 3
    }
}
