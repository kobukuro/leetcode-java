// Dynamic Programming, Bit Manipulation

import java.util.Arrays;

public class CountingBits338 {
    /*
        Time complexity : O(n)
        For each integer x, in the range 1 to n,
        we need to perform a constant number of operations which does not depend on the number of bits in x.

        Space complexity: O(1)
        Since the output array does not count towards the space complexity.
     */
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];
        int offset = 1;
        for (int i = 1; i < dp.length; i++) {
            if (i == offset * 2) {
                offset = i;
            }
            dp[i] = 1 + dp[i - offset];
        }
        return dp;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(Arrays.toString(new CountingBits338().countBits(n))); // [0, 1, 1]
    }
}
