// Tags: String
package com.leetcode.easy;

public class CheckIfAllAsAppearsBeforeAllBs2124 {

    /**
     * Checks if all 'a' characters in the string appear before all 'b' characters.
     * <p>
     * Returns {@code true} if every 'a' in the string appears before every 'b'.
     * If any 'a' appears after a 'b', returns {@code false}.
     * <p>
     * <b>Time Complexity: O(n)</b>
     * <ul>
     *   <li>n = length of the string</li>
     *   <li>Single pass through the string: O(n)</li>
     * </ul>
     * <p>
     * <b>Space Complexity: O(1)</b>
     * <ul>
     *   <li>Only uses a single boolean flag: O(1)</li>
     * </ul>
     *
     * @param s the string to check, containing only characters 'a' and 'b'
     * @return {@code true} if all 'a's appear before all 'b's, {@code false} otherwise
     */
    public boolean checkString(String s) {
        boolean bSeen = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'b') {
                bSeen = true;
            } else {
                if (bSeen) {
                    return false;
                }
            }
        }
        return true;
    }
}
