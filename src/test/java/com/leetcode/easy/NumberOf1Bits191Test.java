package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOf1Bits191Test {
    private NumberOf1Bits191 solution;

    @BeforeEach
    void setUp() {
        solution = new NumberOf1Bits191();
    }

    @Test
    void testHammingWeight_Example1() {
        int n = 11; // Binary representation: 1011
        int expected = 3;
        int result = solution.hammingWeight(n);
        assertEquals(expected, result);
    }

    @Test
    void testHammingWeight_Example2() {
        int n = 128; // Binary representation: 10000000
        int expected = 1;
        int result = solution.hammingWeight(n);
        assertEquals(expected, result);
    }

    @Test
    void testHammingWeight_Example3() {
        int n = 2147483645; // Binary representation: 1111111111111111111111111111101
        int expected = 30;
        int result = solution.hammingWeight(n);
        assertEquals(expected, result);
    }
}
