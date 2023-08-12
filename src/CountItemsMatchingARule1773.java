import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountItemsMatchingARule1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("type", 0);
        mapping.put("color", 1);
        mapping.put("name", 2);
        int index = mapping.get(ruleKey);
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(List.of("phone", "blue", "pixel"));
        items.add(List.of("computer", "silver", "lenovo"));
        items.add(List.of("phone", "gold", "iphone"));
        String ruleKey = "color";
        String ruleValue = "silver";
        // 1
        System.out.println(new CountItemsMatchingARule1773().countMatches(items, ruleKey, ruleValue));
    }
}
