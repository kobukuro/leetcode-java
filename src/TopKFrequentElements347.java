import java.util.Map;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Arrays;

public class TopKFrequentElements347 {
    /*
        Time complexity : O(N log k)
        Space complexity : O(N)
     */
    public int[] topKFrequent(int[] nums, int k) {
        // region Time: O(N), Space:O(N)
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        // endregion
        // region Time: O(N log k), Space:O(k)
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            minHeap.offer(new int[]{value, key});
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        // endregion
        int[] result = new int[k];
        int index = 0;
        while (!minHeap.isEmpty()) {
            int[] pair = minHeap.poll();
            result[index] = pair[1];
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(Arrays.toString(new TopKFrequentElements347().topKFrequent(nums, k)));
        // [1, 2] or [2, 1]
    }
}
