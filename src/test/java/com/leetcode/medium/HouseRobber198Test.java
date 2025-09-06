package com.leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HouseRobber198Test {
    private HouseRobber198 solution;

    @BeforeEach
    void setUp() {
        solution = new HouseRobber198();
    }

    @Test
    void testRobTabulation_Example1() {
        int[] nums = {1, 2, 3, 1};
        int expected = 4;

        int result = solution.robTabulation(nums);

        assertEquals(expected, result);
    }

    @Test
    void testRobTabulation_Example2() {
        int[] nums = {2, 7, 9, 3, 1};
        int expected = 12;

        int result = solution.robTabulation(nums);

        assertEquals(expected, result);
    }
}
