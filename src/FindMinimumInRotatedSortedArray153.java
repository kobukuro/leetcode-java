// Array, Binary Search
public class FindMinimumInRotatedSortedArray153 {
    /*
        Time complexity : O(log n)
        Space complexity : O(1)
     */
    public int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums[0] < nums[nums.length - 1]) {
            return nums[0];
        }
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if (nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            if (nums[mid] > nums[0]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 5, 1, 2};
        System.out.println(new FindMinimumInRotatedSortedArray153().findMin(nums)); // 1
    }
}
