/*
Time Complexity: O(N), where N is the length of the input array.
Space Complexity: O(N) if you take output into account and O(1) otherwise.
*/

import java.util.Arrays;

public class SquaresOfASortedArray977 {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare > rightSquare) {
                res[index] = leftSquare;
                left++;
            } else {
                res[index] = rightSquare;
                right--;
            }
            index--;
        }
        return res;
    }

    public static void main(String[] args) {
        SquaresOfASortedArray977 solution = new SquaresOfASortedArray977();
        assert Arrays.equals(solution.sortedSquares(new int[]{-4, -1, 0, 3, 10}), new int[]{0, 1, 9, 16, 100});
        assert Arrays.equals(solution.sortedSquares(new int[]{-7, -3, 2, 3, 11}), new int[]{4, 9, 9, 49, 121});
    }
}
