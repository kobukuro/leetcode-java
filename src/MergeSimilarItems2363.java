import java.util.*;

public class MergeSimilarItems2363 {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> mapping = new HashMap<>();
        for (int[] item : items1) {
            int value = item[0];
            int weight = item[1];
            if (!mapping.containsKey(value)) {
                mapping.put(value, weight);
            } else {
                mapping.put(value, mapping.get(value) + weight);
            }
        }
        for (int[] item : items2) {
            int value = item[0];
            int weight = item[1];
            if (!mapping.containsKey(value)) {
                mapping.put(value, weight);
            } else {
                mapping.put(value, mapping.get(value) + weight);
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : mapping.entrySet()) {
            List<Integer> temp = new ArrayList<>();
            temp.add(entry.getKey());
            temp.add(entry.getValue());
            res.add(temp);
        }
        res.sort(Comparator.comparingInt(arr -> arr.get(0)));
        return res;
    }

    public static void main(String[] args) {
        int[][] items1 = new int[][]{{1, 1}, {4, 5}, {3, 8}};
        int[][] items2 = new int[][]{{3, 1}, {1, 5}};
        // [[1, 6], [3, 9], [4, 5]]
        System.out.println(new MergeSimilarItems2363().mergeSimilarItems(items1, items2));
    }
}
