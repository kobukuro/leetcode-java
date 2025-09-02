// Tags: Array, Sorting
package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals56 {
    /*
        Time complexity: O(n log n)
        Other than the sort invocation, we do a simple linear scan of the intervals,
        so the runtime is dominated by the O(n log n) complexity of sorting.

        Space complexity: O(logN) (or O(n))
        If we can sort intervals in place, we do not need more than constant additional space,
        although the sorting itself takes O(log n) space.
        Otherwise, we must allocate linear space to store a copy of intervals and sort that.
     */
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] lastInterval = res.getLast();
            if (lastInterval[1] >= intervals[i][0]) {
                lastInterval[1] = Math.max(lastInterval[1], intervals[i][1]);
            } else {
                res.add(intervals[i]);
            }
        }
        return res.toArray(new int[0][]);
    }
}
