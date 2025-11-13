// Tags: String, Two Pointers
package com.leetcode.easy;

public class ReverseString344 {
    /**
     * Time Complexity: O(n) where n is the length of the array
     * - We iterate through half of the array, swapping elements from both ends
     * - Each element is visited exactly once
     * <p>
     * Space Complexity: O(1)
     * - Only uses a constant amount of extra space (variables l, r, and temp)
     * - The reversal is done in-place without allocating additional data structures
     */
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
