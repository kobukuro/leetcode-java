import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            if (!count.containsKey(num)) {
                count.put(num, 1);
            } else {
                count.put(num, count.get(num) + 1);
            }
        }
        int resKey = 0;
        int resVal = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() > resVal) {
                resKey = entry.getKey();
                resVal = entry.getValue();
            }
        }
        return resKey;
    }
}
