// Tags: Array, String
package com.leetcode.easy;

public class CheckIfTwoStringArraysAreEquivalent1662 {
    /*
        Let N be the maximum of the number of all characters in word1 and the number of all characters in word2.
        Time complexity: O(N), since we need to iterate over all characters in word1 and word2 to build the new strings.
        Space complexity: O(N), since we need extra O(N) space to store the new built strings.
     */
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }
}
