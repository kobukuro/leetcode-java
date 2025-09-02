package com.leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeIntervals56Test {
    private MergeIntervals56 mergeIntervals56;

    @BeforeEach
    public void setUp() {
        mergeIntervals56 = new MergeIntervals56();
    }

    @Test
    void testMerge_Example1() {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected = {{1, 6}, {8, 10}, {15, 18}};

        int[][] result = mergeIntervals56.merge(intervals);

        assertArrayEquals(expected, result);
    }

    @Test
    void testMerge_Example2() {
        int[][] intervals = {{1, 4}, {4, 5}};
        int[][] expected = {{1, 5}};
        int[][] result = mergeIntervals56.merge(intervals);
        assertArrayEquals(expected, result);
    }

    @Test
    void testMerge_Example3() {
        int[][] intervals = {{1, 4}, {0, 4}};
        int[][] expected = {{0, 4}};
        int[][] result = mergeIntervals56.merge(intervals);
        assertArrayEquals(expected, result);
    }
}
