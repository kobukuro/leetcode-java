package com.leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public class LongestSubstringWithoutRepeatingCharacters3Test {
    private LongestSubstringWithoutRepeatingCharacters3 solution;

    @BeforeEach
    void setUp() {
        solution = new LongestSubstringWithoutRepeatingCharacters3();
    }

    @Test
    void testLengthOfLongestSubstring_Example1() {
        String s = "abcabcbb";
        int expected = 3;

        int result = assertTimeoutPreemptively(Duration.ofMillis(100), () -> solution.lengthOfLongestSubstring(s));

        assertEquals(expected, result);
    }

    @Test
    void testLengthOfLongestSubstring_Example2() {
        String s = "bbbbb";
        int expected = 1;

        int result = assertTimeoutPreemptively(Duration.ofMillis(100), () -> solution.lengthOfLongestSubstring(s));

        assertEquals(expected, result);
    }

    @Test
    void testLengthOfLongestSubstring_Example3() {
        String s = "pwwkew";
        int expected = 3;

        int result = assertTimeoutPreemptively(Duration.ofMillis(100), () -> solution.lengthOfLongestSubstring(s));

        assertEquals(expected, result);
    }

    @Test
    void testLengthOfLongestSubstring_Example4() {
        String s = "tmmzuxt";
        int expected = 5;

        int result = assertTimeoutPreemptively(Duration.ofMillis(100), () -> solution.lengthOfLongestSubstring(s));

        assertEquals(expected, result);
    }

    @Test
    void testLengthOfLongestSubstring_Example5() {
        String s = "aab";
        int expected = 2;

        int result = assertTimeoutPreemptively(Duration.ofMillis(100), () -> solution.lengthOfLongestSubstring(s));

        assertEquals(expected, result);
    }
}
