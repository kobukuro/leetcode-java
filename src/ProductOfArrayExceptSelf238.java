import java.util.Arrays;

public class ProductOfArrayExceptSelf238 {
    /*
        Time Complexity : O(n)
        Space Complexity : O(n)
     */
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int temp = 1;
        for (int i = 0; i < nums.length; i++) {
            temp *= nums[i];
            prefix[i] = temp;
        }
        temp = 1;
        for (int i = nums.length - 1; i > -1; i--) {
            temp *= nums[i];
            postfix[i] = temp;
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                res[i] = postfix[i + 1];
            } else if (i == nums.length - 1) {
                res[i] = prefix[i - 1];
            } else {
                res[i] = prefix[i - 1] * postfix[i + 1];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(new ProductOfArrayExceptSelf238().productExceptSelf(nums)));
        // [24, 12, 8, 6]
    }
}
