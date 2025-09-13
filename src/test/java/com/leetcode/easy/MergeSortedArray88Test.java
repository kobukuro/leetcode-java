package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortedArray88Test {
    private MergeSortedArray88 solution;

    @BeforeEach
    void setUp() {
        solution = new MergeSortedArray88();
    }

    @Test
    void testMerge_Example1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        int[] expected = {1, 2, 2, 3, 5, 6};
        assertArrayEquals(expected, nums1);
    }

    @Test
    void testMerge_Example2() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;

        solution.merge(nums1, m, nums2, n);

        int[] expected = {1};
        assertArrayEquals(expected, nums1);
    }

    @Test
    void testMerge_Example3() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;

        solution.merge(nums1, m, nums2, n);

        int[] expected = {1};
        assertArrayEquals(expected, nums1);
    }

    @Test
    void testMerge_Example4() {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int m = 3;
        int[] nums2 = {1, 2, 3};
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, nums1);
    }

    @Test
    void testMerge_Example5() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {4, 5, 6};
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, nums1);
    }
}
