package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbingStairs70Test {
    private ClimbingStairs70 solution;

    @BeforeEach
    void setUp() {
        solution = new ClimbingStairs70();
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testClimbStairsMemoization_Example1() {
        int n = 2;
        int expected = 2;

        int result = solution.climbStairsMemoization(n);

        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testClimbStairsMemoization_Example2() {
        int n = 3;
        int expected = 3;

        int result = solution.climbStairsMemoization(n);

        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testClimbStairsMemoization_Example3() {
        int n = 38;
        int expected = 63245986;

        int result = solution.climbStairsMemoization(n);

        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testClimbStairsTabulation_Example1() {
        int n = 2;
        int expected = 2;

        int result = solution.climbStairsTabulation(n);

        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testClimbStairsTabulation_Example2() {
        int n = 3;
        int expected = 3;

        int result = solution.climbStairsTabulation(n);

        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testClimbStairsTabulation_Example3() {
        int n = 38;
        int expected = 63245986;

        int result = solution.climbStairsTabulation(n);

        assertEquals(expected, result);
    }
}
