import java.util.Arrays;

public class ConcatenationOfArray1929 {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length * 2; i++) {
            ans[i] = nums[i % nums.length];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 1};
        // [1, 2, 1, 1, 2, 1]
        System.out.println(Arrays.toString(new ConcatenationOfArray1929().getConcatenation(nums)));
    }
}
