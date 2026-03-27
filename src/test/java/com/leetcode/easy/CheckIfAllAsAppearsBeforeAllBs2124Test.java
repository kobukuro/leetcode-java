package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckIfAllAsAppearsBeforeAllBs2124Test {
    private CheckIfAllAsAppearsBeforeAllBs2124 solution;

    @BeforeEach
    void setUp() {
        solution = new CheckIfAllAsAppearsBeforeAllBs2124();
    }

    @Test
    void testCheckString_Example1_AllABeforeB() {
        // Input: s = "aaabbb"
        // 'a' at indices 0,1,2; 'b' at indices 3,4,5
        assertTrue(solution.checkString("aaabbb"));
    }

    @Test
    void testCheckString_Example2_AAfterB() {
        // Input: s = "abab"
        // 'a' at index 2 appears after 'b' at index 1
        assertFalse(solution.checkString("abab"));
    }

    @Test
    void testCheckString_Example3_NoA() {
        // Input: s = "bbb"
        // No 'a's, so condition is satisfied
        assertTrue(solution.checkString("bbb"));
    }
}
