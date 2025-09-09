package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RichestCustomerWealth1672Test {
    private RichestCustomerWealth1672 solution;

    @BeforeEach
    void setUp() {
        solution = new RichestCustomerWealth1672();
    }

    @Test
    void testMaximumWealth_Example1() {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };
        int expected = 6;
        int result = solution.maximumWealth(accounts);
        assert result == expected : "Expected " + expected + " but got " + result;
    }

    @Test
    void testMaximumWealth_Example2() {
        int[][] accounts = {
                {1, 5},
                {7, 3},
                {3, 5}
        };
        int expected = 10;
        int result = solution.maximumWealth(accounts);
        assert result == expected : "Expected " + expected + " but got " + result;
    }

    @Test
    void testMaximumWealth_Example3() {
        int[][] accounts = {
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };
        int expected = 17;
        int result = solution.maximumWealth(accounts);
        assert result == expected : "Expected " + expected + " but got " + result;
    }
}
