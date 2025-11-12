package com.leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerWithMostWater11Test {
    private ContainerWithMostWater11 solution;

    @BeforeEach
    void setUp() {
        solution = new ContainerWithMostWater11();
    }

    @Test
    void testMaxArea_Example1() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;

        int result = solution.maxArea(height);

        assertEquals(expected, result);
    }

    @Test
    void testMaxArea_Example2() {
        int[] height = {1, 1};
        int expected = 1;

        int result = solution.maxArea(height);

        assertEquals(expected, result);
    }
}
