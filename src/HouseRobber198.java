// Array, Dynamic Programming
public class HouseRobber198 {
    /*
        Time Complexity: O(N) since we have a loop from 0...nums.length-1,
        and we simply use the pre-calculated values of our dynamic programming table
        for calculating the current value in the table which is a constant time operation.

        Space Complexity: O(N) which is used by the table.
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
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1};
        System.out.println(new HouseRobber198().robTabulation(nums));
        // 4
    }
}
