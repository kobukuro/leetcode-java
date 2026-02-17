// Tags: Sliding Window, HashSet, String
package com.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters3 {
    /**
     * Time complexity : O(2n) = O(n). In the worst case each character will be visited twice by l and r.
     * <p>
     * Space complexity : O(n)
     */
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int l = 0;
        Set<Character> hashSet = new HashSet<>();
        for (int r = 0; r < s.length(); r++) {
            while (hashSet.contains(s.charAt(r))) {
                hashSet.remove(s.charAt(l));
                l++;
            }
            hashSet.add(s.charAt(r));
            res = Math.max(r - l + 1, res);
        }
        return res;
    }
}
