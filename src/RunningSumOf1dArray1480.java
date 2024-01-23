import java.util.Arrays;

public class RunningSumOf1dArray1480 {
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            res[i] = currSum;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        // [1, 3, 6, 10]
        System.out.println(Arrays.toString(new RunningSumOf1dArray1480().runningSum(nums)));
    }
}
