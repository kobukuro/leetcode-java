// Tags: Array, String
package com.leetcode.easy;

import java.util.List;

public class CheckIfAStringIsAnAcronymOfWords2828 {
    /**
     * Checks if a string is an acronym of the given list of words.
     * <p>
     * An acronym is formed by taking the first character of each word
     * and concatenating them in order.
     * <p>
     * <b>Time Complexity: O(n)</b>
     * <ul>
     *   <li>n = number of words in the list</li>
     *   <li>Size comparison check: O(1)</li>
     *   <li>Single pass through words list: O(n)</li>
     *   <li>String comparison: O(n)</li>
     * </ul>
     * <p>
     * <b>Space Complexity: O(n)</b>
     * <ul>
     *   <li>StringBuilder stores n characters: O(n)</li>
     * </ul>
     *
     * @param words list of non-empty strings
     * @param s     the string to check if it's the acronym
     * @return {@code true} if s is the acronym of words, {@code false} otherwise
     */
    public boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word.charAt(0));
        }
        return sb.toString().equals(s);
    }
}
