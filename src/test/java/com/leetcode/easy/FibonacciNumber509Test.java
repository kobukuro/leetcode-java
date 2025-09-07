package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciNumber509Test {
    private FibonacciNumber509 solution;

    @BeforeEach
    void setUp() {
        solution = new FibonacciNumber509();
    }

    @Test
    void testFibMemoization_Example1() {
        int n = 2;
        int expected = 1;

        int result = solution.fibMemoization(n);

        assertEquals(expected, result);
    }

    @Test
    void testFibMemoization_Example2() {
        int n = 3;
        int expected = 2;

        int result = solution.fibMemoization(n);

        assertEquals(expected, result);
    }

    @Test
    void testFibMemoization_Example3() {
        int n = 4;
        int expected = 3;

        int result = solution.fibMemoization(n);

        assertEquals(expected, result);
    }

    @Test
    void testDp_Example1() {
        int n = 2;
        int expected = 1;

        int result = solution.fibDp(n);

        assertEquals(expected, result);
    }

    @Test
    void testDp_Example2() {
        int n = 3;
        int expected = 2;

        int result = solution.fibDp(n);

        assertEquals(expected, result);
    }

    @Test
    void testDp_Example3() {
        int n = 4;
        int expected = 3;

        int result = solution.fibDp(n);

        assertEquals(expected, result);
    }
}
