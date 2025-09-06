// Tags: Dynamic Programming
package com.leetcode.medium;

public class HouseRobber198 {
    /*
        Time complexity: O(N) since we have a loop from 0...nums.length-1,
        and we simply use the pre-calculated values of our dynamic programming table
        for calculating the current value in the table which is a constant time operation.

        Space complexity: O(N) which is used by the table.
     */
    public int robTabulation(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }
}
