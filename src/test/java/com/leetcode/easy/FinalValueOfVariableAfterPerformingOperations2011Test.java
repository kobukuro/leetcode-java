package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FinalValueOfVariableAfterPerformingOperations2011Test {
    private FinalValueOfVariableAfterPerformingOperations2011 solution;

    @BeforeEach
    void setUp() {
        solution = new FinalValueOfVariableAfterPerformingOperations2011();
    }

    @Test
    void testFinalValueAfterOperations_Example1() {
        String[] operations = {"--X", "X++", "X++"};
        int expected = 1;
        int result = solution.finalValueAfterOperations(operations);
        assertEquals(expected, result);
    }

    @Test
    void testFinalValueAfterOperations_Example2() {
        String[] operations = {"++X", "++X", "X++"};
        int expected = 3;
        int result = solution.finalValueAfterOperations(operations);
        assertEquals(expected, result);
    }

    @Test
    void testFinalValueAfterOperations_Example3() {
        String[] operations = {"X++", "++X", "--X", "X--"};
        int expected = 0;
        int result = solution.finalValueAfterOperations(operations);
        assertEquals(expected, result);
    }
}
