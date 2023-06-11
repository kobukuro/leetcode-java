// Array, Dynamic Programming, Greedy, Sorting

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals435 {
    /*
        Time Complexity : (n log n)
        Space Complexity : O(log n)
     */
    public int eraseOverlapIntervals(int[][] intervals) {
        int res = 0;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int lastEnd = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (lastEnd > intervals[i][0]) {
                res += 1;
                lastEnd = Math.min(lastEnd, intervals[i][1]);
            } else {
                lastEnd = intervals[i][1];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        System.out.println(new NonOverlappingIntervals435().eraseOverlapIntervals(intervals));
    }
}
