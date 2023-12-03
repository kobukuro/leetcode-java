import java.util.HashMap;
import java.util.Map;

public class RansomNote383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> countR = new HashMap<>();
        char[] charsR = ransomNote.toCharArray();
        for (char c : charsR) {
            countR.put(c, countR.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> countM = new HashMap<>();
        char[] charsM = magazine.toCharArray();
        for (char c : charsM) {
            countM.put(c, countM.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : countR.entrySet()) {
            if (countM.getOrDefault(entry.getKey(), 0) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }
}
