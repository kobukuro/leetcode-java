import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int cnt = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[j] < nums[i]) {
                    cnt++;
                }
            }
            res[i] = cnt;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{8, 1, 2, 2, 3};
        // [4, 0, 1, 1, 3]
        System.out.println(Arrays.toString(new HowManyNumbersAreSmallerThanTheCurrentNumber1365().smallerNumbersThanCurrent(nums)));
    }
}
