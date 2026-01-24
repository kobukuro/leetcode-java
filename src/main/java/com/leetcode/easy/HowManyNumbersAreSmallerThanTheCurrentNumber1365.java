// Tags: Array
package com.leetcode.easy;

public class HowManyNumbersAreSmallerThanTheCurrentNumber1365 {
    /**
     * Time Complexity: O(n²) where n is the length of the nums array
     * - Outer loop iterates through all n elements
     * - Inner loop also iterates through all n elements for each outer iteration
     * - Total operations: n * n = n²
     * <p>
     * Space Complexity: O(n)
     * - Result array 'res' stores n elements
     * - Only uses constant extra space for variables (i, j, count)
     */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[j] < nums[i]) {
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }
}
