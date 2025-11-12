// Tags: Two Pointers, Greedy
package com.leetcode.medium;

public class ContainerWithMostWater11 {
    /**
     * Time Complexity: O(n)
     * <p>
     * Space Complexity: O(1)
     */
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int res = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            res = Math.max(res, area);
            if (height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return res;
    }
}
