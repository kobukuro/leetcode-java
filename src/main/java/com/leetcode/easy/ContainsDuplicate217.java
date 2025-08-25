// Tags: Hash Set
package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
    /*
     Time complexity: O(n), We do search() and insert() for n times and each operation takes constant time.

     Space complexity: O(n), The space used by a hash set is linear with the number of elements in it.
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
