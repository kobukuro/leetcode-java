//Hash Table, Array

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class TwoSum1 {
    /*
    Time complexity: O(n).
    We traverse the array containing n elements only once.
    Each lookup in the hash map costs only O(1) time.

    Space complexity: O(n).
    The extra space required depends on the number of items stored in the hash map,
    which stores at most n elements.
    */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> lookup = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (lookup.containsKey(complement)) {
                return new int[]{lookup.get(complement), i};
            }
            lookup.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(new TwoSum1().twoSum(nums, target))); // [0, 1]
    }
}

