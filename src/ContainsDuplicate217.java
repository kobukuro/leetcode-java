//Array, Hash Table, Sorting


import java.util.HashSet;

public class ContainsDuplicate217 {
    /*
        Time complexity:O(n).
        Space complexity:O(n).
    */
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            if (hashSet.contains(num)) {
                return true;
            }
            hashSet.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1};
        System.out.println(new ContainsDuplicate217().containsDuplicate(nums));
    }
}
