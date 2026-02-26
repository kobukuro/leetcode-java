package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountAsterisks2315Test {
    private CountAsterisks2315 solution;

    @BeforeEach
    void setUp() {
        solution = new CountAsterisks2315();
    }

    @Test
    void testCountAsterisks_Example1() {
        String s = "l|*e*et|c**o|*de|";

        int result = solution.countAsterisks(s);

        assertEquals(2, result);
    }

    @Test
    void testCountAsterisks_Example2() {
        String s = "iamprogrammer";

        int result = solution.countAsterisks(s);

        assertEquals(0, result);
    }

    @Test
    void testCountAsterisks_Example3() {
        String s = "yo|uar|e**|b|e***au|tiful";

        int result = solution.countAsterisks(s);

        assertEquals(5, result);
    }
}
