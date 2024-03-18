import java.util.*;

public class TwoOutOfThree2032 {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }
        Set<Integer> set3 = new HashSet<>();
        for (int num : nums3) {
            set3.add(num);
        }
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : set1) {
            if (!count.containsKey(num)) {
                count.put(num, 1);
            } else {
                count.put(num, count.get(num) + 1);
            }
        }
        for (int num : set2) {
            if (!count.containsKey(num)) {
                count.put(num, 1);
            } else {
                count.put(num, count.get(num) + 1);
            }
        }
        for (int num : set3) {
            if (!count.containsKey(num)) {
                count.put(num, 1);
            } else {
                count.put(num, count.get(num) + 1);
            }
        }
        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() >= 2) {
                res.add(entry.getKey());
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 1, 3, 2};
        int[] nums2 = new int[]{2, 3};
        int[] nums3 = new int[]{3};
        // [2, 3]
        System.out.println(new TwoOutOfThree2032().twoOutOfThree(nums1, nums2, nums3));
    }
}
