package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingWordsWithAGivenPrefix2185Test {
    private CountingWordsWithAGivenPrefix2185 solution;

    @BeforeEach
    void setUp() {
        solution = new CountingWordsWithAGivenPrefix2185();
    }

    @Test
    void testPrefixCount_Example1_TwoMatches() {
        // Input: words = ["pay","attention","practice","attend"], pref = "at"
        // Output: 2
        // Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".
        String[] words = {"pay", "attention", "practice", "attend"};
        String pref = "at";

        int result = solution.prefixCount(words, pref);

        assertEquals(2, result);
    }

    @Test
    void testPrefixCount_Example2_NoMatches() {
        // Input: words = ["leetcode","win","loops","success"], pref = "code"
        // Output: 0
        // Explanation: There are no strings that contain "code" as a prefix.
        String[] words = {"leetcode", "win", "loops", "success"};
        String pref = "code";

        int result = solution.prefixCount(words, pref);

        assertEquals(0, result);
    }
}
