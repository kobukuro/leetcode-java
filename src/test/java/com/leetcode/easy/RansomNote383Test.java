package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RansomNote383Test {
    private RansomNote383 solution;

    @BeforeEach
    void setUp() {
        solution = new RansomNote383();
    }

    @Test
    void testCanConstruct_Example1() {
        String ransomNote = "a";
        String magazine = "b";

        boolean result = solution.canConstruct(ransomNote, magazine);

        assertFalse(result);
    }

    @Test
    void testCanConstruct_Example2() {
        String ransomNote = "aa";
        String magazine = "ab";

        boolean result = solution.canConstruct(ransomNote, magazine);

        assertFalse(result);
    }

    @Test
    void testCanConstruct_Example3() {
        String ransomNote = "aa";
        String magazine = "aab";

        boolean result = solution.canConstruct(ransomNote, magazine);

        assertTrue(result);
    }
}
