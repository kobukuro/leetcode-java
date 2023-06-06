import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals56 {
    /*
        Time Complexity : O(n log n)
        Space Complexity : O(log n)
     */
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] lastMerged = res.get(res.size() - 1);
            if (lastMerged[1] >= intervals[i][0]) {
                res.get(res.size() - 1)[1] = Math.max(lastMerged[1], intervals[i][1]);
            } else {
                res.add(intervals[i]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println(Arrays.deepToString(new MergeIntervals56().merge(intervals)));
        // [[1, 6], [8, 10], [15, 18]]
    }
}
