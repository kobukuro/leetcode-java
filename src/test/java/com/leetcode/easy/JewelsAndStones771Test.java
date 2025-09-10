package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JewelsAndStones771Test {
    private JewelsAndStones771 solution;

    @BeforeEach
    void setUp() {
        solution = new JewelsAndStones771();
    }

    @Test
    void testNumJewelsInStones_Example1() {
        String jewels = "aA";
        String stones = "aAAbbbb";

        int result = solution.numJewelsInStones(jewels, stones);

        assertEquals(3, result);
    }

    @Test
    void testNumJewelsInStones_Example2() {
        String jewels = "z";
        String stones = "ZZ";

        int result = solution.numJewelsInStones(jewels, stones);

        assertEquals(0, result);
    }
}
