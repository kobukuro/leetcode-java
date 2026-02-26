// Tags: String
package com.leetcode.easy;

public class CountAsterisks2315 {
    /**
     * Time complexity: O(n)
     * Breakdown:
     * - Split operation: s.split("\\|") iterates through the entire string - O(n)
     * - Outer loop: Iterates through half of the segments - O(n/2)
     * - Inner loop: Total characters checked is at most n - O(n)
     * <p>
     * Space complexity: O(n)
     * Breakdown:
     * - Array storage: String[] words stores segments - O(n)
     */
    public int countAsterisks(String s) {
        String[] words = s.split("\\|");
        int res = 0;
        for (int i = 0; i < words.length; i = i + 2) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == '*') {
                    res++;
                }
            }
        }
        return res;
    }
}
