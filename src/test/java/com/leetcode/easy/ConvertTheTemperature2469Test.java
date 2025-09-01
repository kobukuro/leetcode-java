package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ConvertTheTemperature2469Test {
    private ConvertTheTemperature2469 solution;

    @BeforeEach
    void setUp() {
        solution = new ConvertTheTemperature2469();
    }

    @Test
    void testConvertTemperature_Example1() {
        double celsius = 36.50;
        double[] expected = {309.65, 97.70};

        double[] result = solution.convertTemperature(celsius);

        assertArrayEquals(expected, result);
    }

    @Test
    void testConvertTemperature_Example2() {
        double celsius = 122.11;
        double[] expected = {395.26, 251.798};

        double[] result = solution.convertTemperature(celsius);

        assertArrayEquals(expected, result);
    }
}
