import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int val : arr) {
            if (!count.containsKey(val)) {
                count.put(val, 1);
            } else {
                count.put(val, count.get(val) + 1);
            }
        }
        Set<Integer> hashSet = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int val = entry.getValue();
            if (hashSet.contains(val)) {
                return false;
            }
            hashSet.add(val);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 1, 1, 3};
        // true
        System.out.println(new UniqueNumberOfOccurrences1207().uniqueOccurrences(arr));
    }
}
