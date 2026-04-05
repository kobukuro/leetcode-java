// Tags: String, Hash Table
package com.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences1941 {
    /**
     * Checks if all characters in the string have equal number of occurrences.
     *
     * <p>Approach:
     * <ul>
     *   <li>Use HashMap to count frequency of each character</li>
     *   <li>Put all frequency values into HashSet</li>
     *   <li>If HashSet size is 1, all characters have same occurrence count</li>
     * </ul>
     *
     * <p>Time Complexity: O(n) where n is the length of the string, single pass required
     * <p>Space Complexity: O(1) as at most 26 unique characters are stored (constraint: lowercase letters only)
     *
     * @param s input string containing only lowercase English letters
     * @return true if all characters appear the same number of times, false otherwise
     */
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return new HashSet<>(freq.values()).size() == 1;
    }
}
