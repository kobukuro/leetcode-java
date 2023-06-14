// Array, Dynamic Programming
public class MaximumProductSubarray152 {
    /*
        Time Complexity : O(n)
        Space Complexity : O(1)
     */
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int minSoFar = nums[0];
        int maxSoFar = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int oriMinSoFar = minSoFar;
            minSoFar = Math.min(Math.min(nums[i], nums[i] * oriMinSoFar), nums[i] * maxSoFar);
            maxSoFar = Math.max(Math.max(nums[i], nums[i] * oriMinSoFar), nums[i] * maxSoFar);
            res = Math.max(res, maxSoFar);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, -2, 4};
        System.out.println(new MaximumProductSubarray152().maxProduct(nums)); // 6
    }
}
