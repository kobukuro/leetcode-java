package com.leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public class WordSearch79Test {
    private WordSearch79 solution;

    @BeforeEach
    void setUp() {
        solution = new WordSearch79();
    }

    @Test
    void testExist_Example1() {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        boolean expected = true;

        boolean result = assertTimeoutPreemptively(Duration.ofMillis(100), () -> solution.exist(board, word));

        assertEquals(expected, result);
    }

    @Test
    void testExist_Example2() {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "SEE";
        boolean expected = true;

        boolean result = assertTimeoutPreemptively(Duration.ofMillis(100), () -> solution.exist(board, word));

        assertEquals(expected, result);
    }

    @Test
    void testExist_Example3() {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCB";
        boolean expected = false;

        boolean result = assertTimeoutPreemptively(Duration.ofMillis(100), () -> solution.exist(board, word));

        assertEquals(expected, result);
    }
}
