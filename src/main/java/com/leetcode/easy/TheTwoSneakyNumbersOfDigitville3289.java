// Tags: Array, Hash Set
package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class TheTwoSneakyNumbersOfDigitville3289 {
    /**
     * Finds the two numbers that appear twice in the array.
     * <p>
     * Time Complexity: O(n) where n is the length of the array.
     * We iterate through the array once, and HashSet operations (add, contains) are O(1) on average.
     * <p>
     * Space Complexity: O(n) for the HashSet to store seen numbers.
     * In the worst case, we store almost all numbers before finding the duplicates.
     */
    public int[] getSneakyNumbers(int[] nums) {
        int[] res = new int[2];
        Set<Integer> seen = new HashSet<>();
        int index = 0;
        for (int num : nums) {
            if (seen.contains(num)) {
                res[index] = num;
                if (index == 1) {
                    break;
                }
                index++;
            } else {
                seen.add(num);
            }
        }
        return res;
    }
}
