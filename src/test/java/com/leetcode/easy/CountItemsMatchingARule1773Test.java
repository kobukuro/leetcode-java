package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountItemsMatchingARule1773Test {
    private CountItemsMatchingARule1773 solution;

    @BeforeEach
    void setUp() {
        solution = new CountItemsMatchingARule1773();
    }

    @Test
    void testCountMatches_Example1() {
        var items = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone")
        );
        String ruleKey = "color";
        String ruleValue = "silver";
        int expected = 1;
        int result = solution.countMatches(items, ruleKey, ruleValue);
        assertEquals(expected, result);
    }

    @Test
    void testCountMatches_Example2() {
        var items = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone")
        );
        String ruleKey = "type";
        String ruleValue = "phone";
        int expected = 2;
        int result = solution.countMatches(items, ruleKey, ruleValue);
        assertEquals(expected, result);
    }
}
