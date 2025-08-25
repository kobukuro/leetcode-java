package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public class ClimbingStairs70Test {
    private ClimbingStairs70 solution;

    @BeforeEach
    void setUp() {
        solution = new ClimbingStairs70();
    }

    @Test
    void testClimbStairsMemoization_Example1() {
        int n = 2;
        int expected = 2;

        int result = assertTimeoutPreemptively(Duration.ofMillis(100), () -> solution.climbStairsMemoization(n));

        assertEquals(expected, result);
    }

    @Test
    void testClimbStairsMemoization_Example2() {
        int n = 3;
        int expected = 3;

        int result = assertTimeoutPreemptively(Duration.ofMillis(100), () -> solution.climbStairsMemoization(n));

        assertEquals(expected, result);
    }

    @Test
    void testClimbStairsMemoization_Example3() {
        int n = 38;
        int expected = 63245986;

        int result = assertTimeoutPreemptively(Duration.ofMillis(100), () -> solution.climbStairsMemoization(n));

        assertEquals(expected, result);
    }

    @Test
    void testClimbStairsTabulation_Example1() {
        int n = 2;
        int expected = 2;

        int result = assertTimeoutPreemptively(Duration.ofMillis(100), () -> solution.climbStairsTabulation(n));

        assertEquals(expected, result);
    }

    @Test
    void testClimbStairsTabulation_Example2() {
        int n = 3;
        int expected = 3;

        int result = assertTimeoutPreemptively(Duration.ofMillis(100), () -> solution.climbStairsTabulation(n));

        assertEquals(expected, result);
    }

    @Test
    void testClimbStairsTabulation_Example3() {
        int n = 38;
        int expected = 63245986;

        int result = assertTimeoutPreemptively(Duration.ofMillis(100), () -> solution.climbStairsTabulation(n));

        assertEquals(expected, result);
    }
}
