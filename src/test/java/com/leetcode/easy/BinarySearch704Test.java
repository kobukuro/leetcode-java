package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearch704Test {
    private BinarySearch704 solution;

    @BeforeEach
    void setUp() {
        solution = new BinarySearch704();
    }

    @Test
    void testSearch_Example1() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int result = solution.search(nums, target);

        assertEquals(4, result);
    }

    @Test
    void testSearch_Example2() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;

        int result = solution.search(nums, target);

        assertEquals(-1, result);
    }
}
