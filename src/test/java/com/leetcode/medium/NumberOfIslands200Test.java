package com.leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NumberOfIslands200Test {
    private NumberOfIslands200 solution;

    @BeforeEach
    void setUp() {
        solution = new NumberOfIslands200();
    }

    @Test
    void testNumIslands_Example1() {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        int result = solution.numIslands(grid);
        assert result == 1;
    }

    @Test
    void testNumIslands_Example2() {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        int result = solution.numIslands(grid);
        assert result == 3;
    }
}
