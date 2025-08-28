package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SquaresOfASortedArray977Test {
    private SquaresOfASortedArray977 solution;

    @BeforeEach
    void setUp() {
        solution = new SquaresOfASortedArray977();
    }

    @Test
    void testSortedSquares_Example1() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] expected = {0, 1, 9, 16, 100};
        assertArrayEquals(expected, solution.sortedSquares(nums));
    }

    @Test
    void testSortedSquares_Example2() {
        int[] nums = {-7, -3, 2, 3, 11};
        int[] expected = {4, 9, 9, 49, 121};
        assertArrayEquals(expected, solution.sortedSquares(nums));
    }
}
