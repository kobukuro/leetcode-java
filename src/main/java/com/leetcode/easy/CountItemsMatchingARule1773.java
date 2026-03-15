// Tags: Array, String
package com.leetcode.easy;

import java.util.List;

public class CountItemsMatchingARule1773 {
    /**
     * Let n = items.size().
     * Time complexity: O(n)
     * Breakdown:
     * - Single for loop: Iterates through all items - O(n)
     * - String comparison: O(1) per comparison (comparing with fixed ruleKey and ruleValue)
     * Overall: O(n)
     * <p>
     * Space complexity: O(1)
     * - Only uses a single integer variable 'res' - O(1)
     */
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;
        for (List<String> item : items) {
            if (ruleKey.equals("type") && item.get(0).equals(ruleValue)) {
                res++;
            } else if (ruleKey.equals("color") && item.get(1).equals(ruleValue)) {
                res++;
            } else if (ruleKey.equals("name") && item.get(2).equals(ruleValue)) {
                res++;
            }
        }
        return res;
    }
}
