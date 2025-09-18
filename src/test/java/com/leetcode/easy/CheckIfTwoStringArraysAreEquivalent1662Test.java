package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckIfTwoStringArraysAreEquivalent1662Test {
    private CheckIfTwoStringArraysAreEquivalent1662 solution;

    @BeforeEach
    void setUp() {
        solution = new CheckIfTwoStringArraysAreEquivalent1662();
    }

    @Test
    void testArrayStringsAreEqual_Example1() {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        boolean result = solution.arrayStringsAreEqual(word1, word2);

        assertTrue(result);
    }

    @Test
    void testArrayStringsAreEqual_Example2() {
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};

        boolean result = solution.arrayStringsAreEqual(word1, word2);

        assertFalse(result);
    }

    @Test
    void testArrayStringsAreEqual_Example3() {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};

        boolean result = solution.arrayStringsAreEqual(word1, word2);

        assertTrue(result);
    }
}
