// Dynamic Programming, Array, Greedy
public class JumpGame55 {
    /*
        Time complexity : O(n^2).
        For every element in the array, say i,
        we are looking at the next nums[i] elements to its right
        aiming to find an index whose value is True in dp list.
        nums[i] can be at most n, where n is the length of array nums.

        Space complexity : O(n).
        This comes from the usage of the memo table.
     */
    public boolean canJumpTabulation(int[] nums) {
        boolean[] dp = new boolean[nums.length];
        dp[nums.length - 1] = true;
        for (int i = nums.length - 2; i >= 0; i--) {
            int furthestJump = Math.min(nums[i], nums.length - 1 - i);
            for (int j = 1; j <= furthestJump; j++) {
                if (dp[i + j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        System.out.println(new JumpGame55().canJumpTabulation(nums)); // true
    }
}
