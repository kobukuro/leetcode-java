import java.util.HashMap;
import java.util.Map;

public class FindWordsThatCanBeFormedByCharacters1160 {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> charsCount = new HashMap<>();
        for (char c : chars.toCharArray()) {
            charsCount.put(c, charsCount.getOrDefault(c, 0) + 1);
        }
        int res = 0;
        for (String word : words) {
            boolean isGood = true;
            Map<Character, Integer> count = new HashMap<>();
            for (char c : word.toCharArray()) {
                count.put(c, count.getOrDefault(c, 0) + 1);
            }
            for (Map.Entry<Character, Integer> entry : count.entrySet()) {
                if (!charsCount.containsKey(entry.getKey())) {
                    isGood = false;
                    break;
                }
                if (entry.getValue() > charsCount.get(entry.getKey())) {
                    isGood = false;
                    break;
                }
            }
            if (isGood) {
                res += word.length();
            }
        }
        return res;
    }
}
