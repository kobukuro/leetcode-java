// Array, Hash Table, Union Find

import java.util.Set;
import java.util.HashSet;

public class LongestConsecutiveSequence128 {
    /*
        Time complexity : O(n).
        Although the time complexity appears to be quadratic due to the while loop nested within the for loop,
        closer inspection reveals it to be linear.
        Because the while loop is reached only when currNum marks the beginning of a sequence
        (i.e. currNum-1 is not present in nums),
        the while loop can only run for n iterations throughout the entire runtime of the algorithm.
        This means that despite looking like O(n⋅n) complexity,
        the nested loops actually run in O(n + n) = O(n) time.
        All other computations occur in constant time, so the overall runtime is linear.

        Space complexity : O(n).
        In order to set up O(1) containment lookups,
        we allocate linear space for a hash set to store the O(n) numbers in nums.
     */
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }
        int res = 0;
        for (int num : nums) {
            if (!hashSet.contains(num - 1)) {
                int currLen = 0;
                int currNum = num;
                while (hashSet.contains(currNum)) {
                    currLen++;
                    currNum++;
                }
                res = Math.max(res, currLen);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};
        System.out.println(new LongestConsecutiveSequence128().longestConsecutive(nums));
        // 4
    }
}
