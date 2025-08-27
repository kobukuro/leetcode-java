package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParentheses20Test {
    private ValidParentheses20 solution;

    @BeforeEach
    void setUp() {
        solution = new ValidParentheses20();
    }

    @Test
    void testIsValid_Example1() {
        String s = "()";
        assertTrue(solution.isValid(s));
    }

    @Test
    void testIsValid_Example2() {
        String s = "()[]{}";
        assertTrue(solution.isValid(s));
    }

    @Test
    void testIsValid_Example3() {
        String s = "(]";
        assertFalse(solution.isValid(s));
    }

    @Test
    void testIsValid_Example4() {
        String s = "([])";
        assertTrue(solution.isValid(s));
    }

    @Test
    void testIsValid_Example5() {
        String s = "([)]";
        assertFalse(solution.isValid(s));
    }
}
