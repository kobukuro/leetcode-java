package com.leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinChange322Test {
    private CoinChange322 solution;

    @BeforeEach
    void setUp() {
        solution = new CoinChange322();
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testCoinChangeMemoization_Example1() {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int expected = 3;

        int result = solution.coinChangeMemoization(coins, amount);

        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testCoinChangeMemoization_Example2() {
        int[] coins = {2};
        int amount = 3;
        int expected = -1;

        int result = solution.coinChangeMemoization(coins, amount);

        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testCoinChangeMemoization_Example3() {
        int[] coins = {1};
        int amount = 0;
        int expected = 0;

        int result = solution.coinChangeMemoization(coins, amount);

        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testCoinChangeMemoization_Example4() {
        int[] coins = {1, 2, 5};
        int amount = 100;
        int expected = 20;

        int result = solution.coinChangeMemoization(coins, amount);

        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testCoinChangeTabulation_Example1() {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int expected = 3;

        int result = solution.coinChangeTabulation(coins, amount);

        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testCoinChangeTabulation_Example2() {
        int[] coins = {2};
        int amount = 3;
        int expected = -1;

        int result = solution.coinChangeTabulation(coins, amount);

        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testCoinChangeTabulation_Example3() {
        int[] coins = {1};
        int amount = 0;
        int expected = 0;

        int result = solution.coinChangeTabulation(coins, amount);

        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testCoinChangeTabulation_Example4() {
        int[] coins = {1, 2, 5};
        int amount = 100;
        int expected = 20;

        int result = solution.coinChangeTabulation(coins, amount);

        assertEquals(expected, result);
    }

}
