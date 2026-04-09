// Tags: Array
package com.leetcode.easy;

/**
 * <p><b>Time Complexity:</b> O(n)
 * <ul>
 *   <li>Single loop through 2n elements, where n = nums.length</li>
 *   <li>Each iteration performs O(1) operations (modulo and array access)</li>
 *   <li>Total: O(2n) = O(n)</li>
 * </ul>
 *
 * <p><b>Space Complexity:</b> O(n)
 * <ul>
 *   <li>Result array of size 2n is allocated</li>
 *   <li>No additional significant space used</li>
 *   <li>Total: O(2n) = O(n)</li>
 * </ul>
 */
public class ConcatenationOfArray1929 {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length * 2; i++) {
            ans[i] = nums[i % nums.length];
        }
        return ans;
    }
}
