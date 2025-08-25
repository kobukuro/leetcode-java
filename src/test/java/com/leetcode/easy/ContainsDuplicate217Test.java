package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContainsDuplicate217Test {
    private ContainsDuplicate217 solution;

    @BeforeEach
    void setUp() {
        solution = new ContainsDuplicate217();
    }

    @Test
    void testContainsDuplicate_Example1() {
        int[] nums = {1, 2, 3, 1};
        assertTrue(solution.containsDuplicate(nums));
    }

    @Test
    void testContainsDuplicate_Example2() {
        int[] nums = {1, 2, 3, 4};
        assertFalse(solution.containsDuplicate(nums));
    }

    @Test
    void testContainsDuplicate_Example3() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertTrue(solution.containsDuplicate(nums));
    }
}
