import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences1941 {
    public boolean areOccurrencesEqual(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> count = new HashMap<>();
        for (char c : chars) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        Set<Integer> hashSet = new HashSet<>(count.values());
        return hashSet.size() == 1;
    }
}
