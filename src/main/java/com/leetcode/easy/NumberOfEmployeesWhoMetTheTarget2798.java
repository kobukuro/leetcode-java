// Tags: Array
package com.leetcode.easy;

public class NumberOfEmployeesWhoMetTheTarget2798 {
    /**
     * Time Complexity: O(n) where n is the length of the hours array
     * - We iterate through the entire array once
     * - Each element is checked exactly once
     * <p>
     * Space Complexity: O(1)
     * - Only uses a constant amount of extra space (variables res and hour)
     * - No additional data structures are allocated
     */
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int res = 0;
        for (int hour : hours) {
            if (hour >= target) {
                res++;
            }
        }
        return res;
    }
}
