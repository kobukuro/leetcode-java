package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TheTwoSneakyNumbersOfDigitville3289Test {
    private TheTwoSneakyNumbersOfDigitville3289 solution;

    @BeforeEach
    void setUp() {
        solution = new TheTwoSneakyNumbersOfDigitville3289();
    }

    @Test
    void testGetSneakyNumbers_Example1() {
        int[] nums = {0, 1, 1, 0};
        int[] expected = {0, 1};

        int[] result = solution.getSneakyNumbers(nums);
        Arrays.sort(result);

        assertArrayEquals(expected, result);
    }

    @Test
    void testGetSneakyNumbers_Example2() {
        int[] nums = {0, 3, 2, 1, 3, 2};
        int[] expected = {2, 3};

        int[] result = solution.getSneakyNumbers(nums);
        Arrays.sort(result);

        assertArrayEquals(expected, result);
    }

    @Test
    void testGetSneakyNumbers_Example3() {
        int[] nums = {7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2};
        int[] expected = {4, 5};

        int[] result = solution.getSneakyNumbers(nums);
        Arrays.sort(result);

        assertArrayEquals(expected, result);
    }
}
