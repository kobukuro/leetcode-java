// Tags: String
package com.leetcode.easy;

public class CountAsterisks2315 {
    /**
     * Let n = s.length() and m = words.length (the number of split segments), where m <= n + 1.
     * Time complexity: O(n)
     * Breakdown:
     * - Split operation: s.split("\\|") iterates through the entire string - O(n)
     * - Outer loop: Iterates through about half of the segments - O(m/2) = O(m)
     * - Inner loop: Across all iterations, the total number of characters checked is at most n - O(n)
     * Overall: O(n)
     * <p>
     * Space complexity: O(n)
     * - Array storage: String[] words holds m references to substrings whose total length is O(n) - O(n)
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
