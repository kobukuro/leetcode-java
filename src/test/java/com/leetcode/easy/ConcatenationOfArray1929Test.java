package com.leetcode.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ConcatenationOfArray1929Test {

    @Test
    void testExample1() {
        ConcatenationOfArray1929 solution = new ConcatenationOfArray1929();
        int[] nums = {1, 2, 1};
        int[] expected = {1, 2, 1, 1, 2, 1};
        int[] result = solution.getConcatenation(nums);
        assertArrayEquals(expected, result);
    }

    @Test
    void testExample2() {
        ConcatenationOfArray1929 solution = new ConcatenationOfArray1929();
        int[] nums = {1, 3, 2, 1};
        int[] expected = {1, 3, 2, 1, 1, 3, 2, 1};
        int[] result = solution.getConcatenation(nums);
        assertArrayEquals(expected, result);
    }
}
