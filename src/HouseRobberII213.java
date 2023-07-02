// Array, Dynamic Programming

import java.util.Arrays;

public class HouseRobberII213 {
    private int dpRob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }

    /*
        Time Complexity: O(N)
        Space Complexity: O(N)
     */
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(this.dpRob(Arrays.copyOfRange(nums, 0, nums.length - 1)), this.dpRob(Arrays.copyOfRange(nums, 1, nums.length)));
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 2};
        System.out.println(new HouseRobberII213().rob(nums)); // 3
    }
}
