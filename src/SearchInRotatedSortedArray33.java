// Array, Binary Search
public class SearchInRotatedSortedArray33 {
    public int binarySearch(int[] nums, int l, int r, int target) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public int findIndexOfMinimum(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return mid + 1;
            }
            if (nums[mid] < nums[mid - 1]) {
                return mid;
            }
            if (nums[mid] > nums[0]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    /*
        Time complexity : O(log n)
        Space complexity : O(1)
     */
    public int search(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }
        if (nums[0] < nums[nums.length - 1]) {
            return this.binarySearch(nums, 0, nums.length - 1, target);
        }
        int indexOfMinimum = this.findIndexOfMinimum(nums);
        if (target == nums[0]) {
            return 0;
        } else if (target > nums[0]) {
            return this.binarySearch(nums, 1, indexOfMinimum - 1, target);
        } else {
            return this.binarySearch(nums, indexOfMinimum, nums.length - 1, target);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(new SearchInRotatedSortedArray33().search(nums, target)); // 4
    }
}
