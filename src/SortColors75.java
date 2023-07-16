import java.util.Arrays;

public class SortColors75 {
    private int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (nums[j] < pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i + 1];
        nums[i + 1] = nums[right];
        nums[right] = temp;
        return i + 1;
    }

    private void qs(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int index = this.partition(nums, left, right);
        this.qs(nums, left, index - 1);
        this.qs(nums, index + 1, right);
    }

    private void quickSort(int[] nums) {
        this.qs(nums, 0, nums.length - 1);
    }

    public void sortColors(int[] nums) {
        this.quickSort(nums);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        new SortColors75().sortColors(nums);
        System.out.println(Arrays.toString(nums)); // [0, 0, 1, 1, 2, 2]
    }
}
