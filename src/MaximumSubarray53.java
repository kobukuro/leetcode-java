// Array, Divide and Conquer, Dynamic Programming
public class MaximumSubarray53 {
    /*
        Time Complexity : O(n)
        Space Complexity : O(n)
     */
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        int res = nums[0];
        dp[0] = nums[0];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new MaximumSubarray53().maxSubArray(nums)); // 6
    }
}
