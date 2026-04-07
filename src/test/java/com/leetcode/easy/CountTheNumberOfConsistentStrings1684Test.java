package com.leetcode.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTheNumberOfConsistentStrings1684Test {

    @Test
    void testExample1() {
        CountTheNumberOfConsistentStrings1684 solution = new CountTheNumberOfConsistentStrings1684();
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        int expected = 2;

        int result = solution.countConsistentStrings(allowed, words);

        assertEquals(expected, result,
            "Strings \"aaab\" and \"baa\" are consistent since they only contain characters 'a' and 'b'");
    }

    @Test
    void testExample2() {
        CountTheNumberOfConsistentStrings1684 solution = new CountTheNumberOfConsistentStrings1684();
        String allowed = "abc";
        String[] words = {"a", "b", "c", "ab", "ac", "bc", "abc"};
        int expected = 7;

        int result = solution.countConsistentStrings(allowed, words);

        assertEquals(expected, result,
            "All strings should be consistent");
    }

    @Test
    void testExample3() {
        CountTheNumberOfConsistentStrings1684 solution = new CountTheNumberOfConsistentStrings1684();
        String allowed = "cad";
        String[] words = {"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"};
        int expected = 4;

        int result = solution.countConsistentStrings(allowed, words);

        assertEquals(expected, result,
            "Strings \"cc\", \"acd\", \"ac\", and \"d\" are consistent");
    }
}
