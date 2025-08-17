package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSum1Test {
    private TwoSum1 solution;

    @BeforeEach
    void setUp() {
        solution = new TwoSum1();
    }

    @Test
    void testTwoSum_Example1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        assertEquals(target, nums[result[0]] + nums[result[1]]);
        assertNotEquals(result[0], result[1]);
    }

    @Test
    void testTwoSum_Example2() {
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] result = solution.twoSum(nums, target);

        assertEquals(target, nums[result[0]] + nums[result[1]]);
        assertNotEquals(result[0], result[1]);
    }

    @Test
    void testTwoSum_Example3() {
        int[] nums = {3, 3};
        int target = 6;

        int[] result = solution.twoSum(nums, target);

        assertEquals(target, nums[result[0]] + nums[result[1]]);
        assertNotEquals(result[0], result[1]);
    }
}
