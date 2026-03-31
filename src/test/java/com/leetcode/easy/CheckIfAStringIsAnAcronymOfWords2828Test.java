package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckIfAStringIsAnAcronymOfWords2828Test {
    private CheckIfAStringIsAnAcronymOfWords2828 solution;

    @BeforeEach
    void setUp() {
        solution = new CheckIfAStringIsAnAcronymOfWords2828();
    }

    @Test
    void testIsAcronym_Example1_ValidAcronym() {
        // Input: words = ["alice","bob","charlie"], s = "abc"
        // First characters: 'a', 'b', 'c' -> "abc"
        List<String> words = Arrays.asList("alice", "bob", "charlie");
        String s = "abc";

        assertTrue(solution.isAcronym(words, s));
    }

    @Test
    void testIsAcronym_Example2_LengthMismatch() {
        // Input: words = ["an","apple"], s = "a"
        // First characters: 'a', 'a' -> "aa" (length 2)
        // s = "a" (length 1), so cannot match
        List<String> words = Arrays.asList("an", "apple");
        String s = "a";

        assertFalse(solution.isAcronym(words, s));
    }

    @Test
    void testIsAcronym_Example3_LongAcronym() {
        // Input: words = ["never","gonna","give","up","on","you"], s = "ngguoy"
        // First characters: 'n', 'g', 'g', 'u', 'o', 'y' -> "ngguoy"
        List<String> words = Arrays.asList("never", "gonna", "give", "up", "on", "you");
        String s = "ngguoy";

        assertTrue(solution.isAcronym(words, s));
    }
}
