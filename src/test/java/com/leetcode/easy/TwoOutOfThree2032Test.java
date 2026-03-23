package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoOutOfThree2032Test {
    private TwoOutOfThree2032 solution;

    @BeforeEach
    void setUp() {
        solution = new TwoOutOfThree2032();
    }

    @Test
    void testTwoOutOfThree_Example1() {
        int[] nums1 = {1, 1, 3, 2};
        int[] nums2 = {2, 3};
        int[] nums3 = {3};

        List<Integer> result = solution.twoOutOfThree(nums1, nums2, nums3);

        assertEquals(2, result.size());
        assertTrue(result.contains(3));
        assertTrue(result.contains(2));
    }

    @Test
    void testTwoOutOfThree_Example2() {
        int[] nums1 = {3, 1};
        int[] nums2 = {2, 3};
        int[] nums3 = {1, 2};

        List<Integer> result = solution.twoOutOfThree(nums1, nums2, nums3);

        assertEquals(3, result.size());
        assertTrue(result.contains(2));
        assertTrue(result.contains(3));
        assertTrue(result.contains(1));
    }

    @Test
    void testTwoOutOfThree_Example3() {
        int[] nums1 = {1, 2, 2};
        int[] nums2 = {4, 3, 3};
        int[] nums3 = {5};

        List<Integer> result = solution.twoOutOfThree(nums1, nums2, nums3);

        assertTrue(result.isEmpty());
    }
}
