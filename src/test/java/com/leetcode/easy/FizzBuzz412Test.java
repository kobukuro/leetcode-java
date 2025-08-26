package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzz412Test {
    private FizzBuzz412 solution;

    @BeforeEach
    void setUp() {
        solution = new FizzBuzz412();
    }

    @Test
    void testFizzBuzz_Example1() {
        int n = 3;
        List<String> expected = List.of("1", "2", "Fizz");
        List<String> result = solution.fizzBuzz(n);
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzz_Example2() {
        int n = 5;
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz");
        List<String> result = solution.fizzBuzz(n);
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzz_Example3() {
        int n = 15;
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        List<String> result = solution.fizzBuzz(n);
        assertEquals(expected, result);
    }
}
