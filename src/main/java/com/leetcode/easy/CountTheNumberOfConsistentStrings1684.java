// Tags: Array, String, Hash Set
package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class CountTheNumberOfConsistentStrings1684 {

    /**
     * Counts the number of consistent strings in the given array.
     * A string is consistent if all its characters appear in the allowed string.
     *
     * <p>Algorithm:
     * <ol>
     *   <li>Convert allowed string to a HashSet for O(1) character lookup</li>
     *   <li>For each word, check if all characters exist in the allowed set</li>
     *   <li>Count words that pass the consistency check</li>
     * </ol>
     *
     * <p>Time Complexity: O(m + n×k) where m = allowed.length(), n = words.length, k = average word length
     * <br>Space Complexity: O(m) for storing the allowed characters in HashSet
     *
     * @param allowed String containing all allowed characters
     * @param words   Array of strings to check for consistency
     * @return The number of consistent strings
     */
    public int countConsistentStrings(String allowed, String[] words) {
        int res = 0;
        Set<Character> allowedCharacters = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            allowedCharacters.add(allowed.charAt(i));
        }
        for (String word : words) {
            boolean isConsistent = true;
            for (int i = 0; i < word.length(); i++) {
                if (!allowedCharacters.contains(word.charAt(i))) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) {
                res++;
            }
        }
        return res;
    }
}
