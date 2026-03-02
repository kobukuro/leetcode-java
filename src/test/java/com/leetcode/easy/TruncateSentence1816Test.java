package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TruncateSentence1816Test {
    private TruncateSentence1816 solution;

    @BeforeEach
    void setUp() {
        solution = new TruncateSentence1816();
    }

    @Test
    void testTruncateSentence_Example1() {
        String s = "Hello how are you Contestant";
        int k = 4;

        String result = solution.truncateSentence(s, k);

        assertEquals("Hello how are you", result);
    }

    @Test
    void testTruncateSentence_Example2() {
        String s = "What is the solution to this problem";
        int k = 4;

        String result = solution.truncateSentence(s, k);

        assertEquals("What is the solution", result);
    }

    @Test
    void testTruncateSentence_Example3() {
        String s = "chopper is not a tanuki";
        int k = 5;

        String result = solution.truncateSentence(s, k);

        assertEquals("chopper is not a tanuki", result);
    }
}
