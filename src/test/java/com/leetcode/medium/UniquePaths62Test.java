package com.leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public class UniquePaths62Test {
    private UniquePaths62 solution;

    @BeforeEach
    void setUp() {
        solution = new UniquePaths62();
    }

    @Test
    void testUniquePathsMemoization_Example1() {
        int m = 3;
        int n = 7;
        int expected = 28;

        int result = assertTimeoutPreemptively(Duration.ofMillis(100), () -> solution.uniquePathsMemoization(m, n));

        assertEquals(expected, result);
    }

    @Test
    void testUniquePathsMemoization_Example2() {
        int m = 3;
        int n = 2;
        int expected = 3;

        int result = assertTimeoutPreemptively(Duration.ofMillis(100), () -> solution.uniquePathsMemoization(m, n));

        assertEquals(expected, result);
    }

    @Test
    void testUniquePathsMemoization_Example3() {
        int m = 23;
        int n = 12;
        int expected = 193536720;

        int result = assertTimeoutPreemptively(Duration.ofMillis(100), () -> solution.uniquePathsMemoization(m, n));

        assertEquals(expected, result);
    }

    @Test
    void testUniquePathsTabulation_Example1() {
        int m = 3;
        int n = 7;
        int expected = 28;

        int result = assertTimeoutPreemptively(Duration.ofMillis(100), () -> solution.uniquePathsTabulation(m, n));

        assertEquals(expected, result);
    }

    @Test
    void testUniquePathsTabulation_Example2() {
        int m = 3;
        int n = 2;
        int expected = 3;

        int result = assertTimeoutPreemptively(Duration.ofMillis(100), () -> solution.uniquePathsTabulation(m, n));

        assertEquals(expected, result);
    }

    @Test
    void testUniquePathsTabulation_Example3() {
        int m = 23;
        int n = 12;
        int expected = 193536720;

        int result = assertTimeoutPreemptively(Duration.ofMillis(100), () -> solution.uniquePathsTabulation(m, n));

        assertEquals(expected, result);
    }
}
