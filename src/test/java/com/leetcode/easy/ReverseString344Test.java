package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseString344Test {
    private ReverseString344 solution;

    @BeforeEach
    void setUp() {
        solution = new ReverseString344();
    }

    @Test
    void testReverseString_Example1() {
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        char[] expected = {'o', 'l', 'l', 'e', 'h'};
        solution.reverseString(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testReverseString_Example2() {
        char[] input = {'H', 'a', 'n', 'n', 'a', 'h'};
        char[] expected = {'h', 'a', 'n', 'n', 'a', 'H'};
        solution.reverseString(input);
        assertArrayEquals(expected, input);
    }
}
