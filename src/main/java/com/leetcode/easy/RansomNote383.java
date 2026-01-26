// Tags: String, Hash Table
package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote383 {
    /**
     * Complexity Analysis:
     * Let m = length of magazine, n = length of ransom note, k = number of unique characters.
     * Note: k is at most 26 (constant) for lowercase English letters.
     * <p>
     * Time Complexity: O(m)
     * - Early return when m < n takes O(1)
     * - Building magazine character frequency map: O(m)
     * - Building ransom note character frequency map: O(n)
     * - Validating character counts by iterating ransom note map: O(n)
     * - Total: O(m) + O(n) + O(n)
     * - Since we only proceed when m ≥ n, we can simplify: O(m) + O(m) + O(m) = O(m)
     * <p>
     * Space Complexity: O(k) or O(1)
     * - Two hash maps store character frequencies, each with at most k unique characters
     * - Since k ≤ 26 (constant), can be considered O(1) space
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        Map<Character, Integer> countR = new HashMap<>();
        for (char c : ransomNote.toCharArray()) {
            countR.put(c, countR.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> countM = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            countM.put(c, countM.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : countR.entrySet()) {
            if (countM.getOrDefault(entry.getKey(), 0) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }
}
