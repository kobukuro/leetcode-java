// Tags: Array, String
package com.leetcode.easy;

public class CountingWordsWithAGivenPrefix2185 {
    /**
     * Returns the number of strings in the array that have the given prefix.
     *
     * <p>This method iterates through each word in the array and checks if it starts
     * with the specified prefix using String.startsWith().
     *
     * @param words the array of strings to search through
     * @param pref the prefix string to match
     * @return the count of words that start with the given prefix
     *
     * <p><b>Time Complexity:</b> O(n * m)
     * <ul>
     *   <li>n = number of words in the array</li>
     *   <li>m = length of the prefix string</li>
     *   <li>We iterate through n words, and for each word, startsWith() compares up to m characters</li>
     * </ul>
     *
     * <p><b>Space Complexity:</b> O(1)
     * <ul>
     *   <li>Only uses a constant amount of extra space (the result counter variable)</li>
     *   <li>No data structures that scale with input size</li>
     * </ul>
     */
    public int prefixCount(String[] words, String pref) {
        int res = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                res += 1;
            }
        }
        return res;
    }
}
