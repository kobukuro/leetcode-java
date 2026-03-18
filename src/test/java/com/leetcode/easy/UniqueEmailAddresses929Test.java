package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueEmailAddresses929Test {
    private UniqueEmailAddresses929 solution;

    @BeforeEach
    void setUp() {
        solution = new UniqueEmailAddresses929();
    }

    @Test
    void testExample1() {
        String[] emails = {
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"
        };
        assertEquals(2, solution.numUniqueEmails(emails));
    }

    @Test
    void testExample2() {
        String[] emails = {
                "a@leetcode.com",
                "b@leetcode.com",
                "c@leetcode.com"
        };
        assertEquals(3, solution.numUniqueEmails(emails));
    }
}
