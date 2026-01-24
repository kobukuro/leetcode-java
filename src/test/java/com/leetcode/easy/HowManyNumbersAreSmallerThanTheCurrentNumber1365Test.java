package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HowManyNumbersAreSmallerThanTheCurrentNumber1365Test {
    private HowManyNumbersAreSmallerThanTheCurrentNumber1365 solution;

    @BeforeEach
    void setUp() {
        solution = new HowManyNumbersAreSmallerThanTheCurrentNumber1365();
    }

    @Test
    void testSmallerNumbersThanCurrent_Example1() {
        int[] nums = {8, 1, 2, 2, 3};
        int[] expected = {4, 0, 1, 1, 3};
        int[] result = solution.smallerNumbersThanCurrent(nums);
        assertArrayEquals(expected, result);
    }

    @Test
    void testSmallerNumbersThanCurrent_Example2() {
        int[] nums = {6, 5, 4, 8};
        int[] expected = {2, 1, 0, 3};
        int[] result = solution.smallerNumbersThanCurrent(nums);
        assertArrayEquals(expected, result);
    }

    @Test
    void testSmallerNumbersThanCurrent_Example3() {
        int[] nums = {7, 7, 7, 7};
        int[] expected = {0, 0, 0, 0};
        int[] result = solution.smallerNumbersThanCurrent(nums);
        assertArrayEquals(expected, result);
    }
}
