package com.leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaxAreaOfIsland695Test {
    private MaxAreaOfIsland695 solution;

    @BeforeEach
    void setUp() {
        solution = new MaxAreaOfIsland695();
    }

    @Test
    void testMaxAreaOfIsland_Example1() {
        int[][] grid = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        int expected = 6;
        int result = solution.maxAreaOfIsland(grid);
        assert result == expected : "Test failed! Expected: " + expected + ", but got: " + result;
    }

    @Test
    void testMaxAreaOfIsland_Example2() {
        int[][] grid = {
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        int expected = 0;
        int result = solution.maxAreaOfIsland(grid);
        assert result == expected : "Test failed! Expected: " + expected + ", but got: " + result;
    }
}
