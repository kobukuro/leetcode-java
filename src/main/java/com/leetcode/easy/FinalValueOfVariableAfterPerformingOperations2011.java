// Tags: Array, String, Simulation
package com.leetcode.easy;

/**
 * Time Complexity: O(n) where n is the length of the operations array.
 * We iterate through each operation exactly once.
 * <p>
 * Space Complexity: O(1) as we only use a constant amount of extra space
 * for the result variable, regardless of input size.
 */
public class FinalValueOfVariableAfterPerformingOperations2011 {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for (String operation : operations) {
            if (operation.charAt(1) == '+') {
                res++;
            } else {
                res--;
            }
        }
        return res;
    }
}
