// Tags: Bit Manipulation, Divide and Conquer
package com.leetcode.easy;

public class NumberOf1Bits191 {
    /**
     * Time complexity: O(1)
     * Space complexity: O(1)
     */
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            if (n % 2 == 1) {
                res++;
            }
            n = n >> 1;
        }
        return res;
    }
}
