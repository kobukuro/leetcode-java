package com.leetcode.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CheckIfAllCharactersHaveEqualNumberOfOccurrences1941Test {

    @Test
    void testAreOccurrencesEqualExample1() {
        CheckIfAllCharactersHaveEqualNumberOfOccurrences1941 solution = new CheckIfAllCharactersHaveEqualNumberOfOccurrences1941();
        String s = "abacbc";
        boolean result = solution.areOccurrencesEqual(s);
        assertTrue(result, "The characters 'a', 'b', and 'c' should all occur 2 times in s");
    }

    @Test
    void testAreOccurrencesEqualExample2() {
        CheckIfAllCharactersHaveEqualNumberOfOccurrences1941 solution = new CheckIfAllCharactersHaveEqualNumberOfOccurrences1941();
        String s = "aaabb";
        boolean result = solution.areOccurrencesEqual(s);
        assertFalse(result, "'a' occurs 3 times while 'b' occurs 2 times, which is not equal");
    }
}
