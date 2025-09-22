package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DestinationCity1436Test {
    private DestinationCity1436 solution;

    @BeforeEach
    void setUp() {
        solution = new DestinationCity1436();
    }

    @Test
    void testDestCity_Example1() {
        List<List<String>> paths = List.of(
                List.of("London", "New York"),
                List.of("New York", "Lima"),
                List.of("Lima", "Sao Paulo")
        );
        String expected = "Sao Paulo";
        String result = solution.destCity(paths);
        assertEquals(expected, result);
    }

    @Test
    void testDestCity_Example2() {
        List<List<String>> paths = List.of(
                List.of("B", "C"),
                List.of("D", "B"),
                List.of("C", "A")
        );
        String expected = "A";
        String result = solution.destCity(paths);
        assertEquals(expected, result);
    }

    @Test
    void testDestCity_Example3() {
        List<List<String>> paths = List.of(
                List.of("A", "Z")
        );
        String expected = "Z";
        String result = solution.destCity(paths);
        assertEquals(expected, result);
    }
}
