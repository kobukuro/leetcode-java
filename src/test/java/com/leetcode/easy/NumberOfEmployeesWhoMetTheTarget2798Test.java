package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfEmployeesWhoMetTheTarget2798Test {
    private NumberOfEmployeesWhoMetTheTarget2798 solution;

    @BeforeEach
    void setUp() {
        solution = new NumberOfEmployeesWhoMetTheTarget2798();
    }

    @Test
    void testNumberOfEmployeesWhoMetTarget_Example1() {
        int[] hours = {0, 1, 2, 3, 4};
        int target = 2;

        int result = solution.numberOfEmployeesWhoMetTarget(hours, target);

        assertEquals(3, result);
    }

    @Test
    void testNumberOfEmployeesWhoMetTarget_Example2() {
        int[] hours = {5, 1, 4, 2, 3};
        int target = 6;

        int result = solution.numberOfEmployeesWhoMetTarget(hours, target);

        assertEquals(0, result);
    }
}
