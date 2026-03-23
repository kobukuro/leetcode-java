// Tags: Array, Hash Set, Hash Table
package com.leetcode.easy;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TwoOutOfThree2032 {

    /**
     * Returns a list of integers that appear in at least two out of three given arrays.
     * <p>
     * Each value in the result must be unique, even if it appears multiple times across arrays.
     * <p>
     * <b>Time Complexity: O(n₁ + n₂ + n₃)</b>
     * <ul>
     *   <li>n₁, n₂, n₃ = lengths of nums1, nums2, nums3 respectively</li>
     *   <li>Creating three HashSets: O(n₁ + n₂ + n₃) - each element inserted once</li>
     *   <li>Counting occurrences: O(u₁ + u₂ + u₃) where uᵢ ≤ nᵢ (unique elements per array)</li>
     *   <li>Building result list: O(u) where u = total unique values across all arrays</li>
     *   <li>Total: O(n₁ + n₂ + n₃) since uᵢ ≤ nᵢ</li>
     * </ul>
     * <p>
     * <b>Space Complexity: O(n₁ + n₂ + n₃)</b>
     * <ul>
     *   <li>Three HashSets store unique elements: O(u₁ + u₂ + u₃) ≤ O(n₁ + n₂ + n₃)</li>
     *   <li>HashMap stores counts for all unique values: O(u)</li>
     *   <li>Result list: at most O(u)</li>
     *   <li>Worst case: all elements across all arrays are unique</li>
     * </ul>
     *
     * @param nums1 first integer array
     * @param nums2 second integer array
     * @param nums3 third integer array
     * @return list of integers appearing in at least two arrays
     */
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
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        for (int num : set2) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        for (int num : set3) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() >= 2) {
                res.add(entry.getKey());
            }
        }
        return res;
    }
}
