import java.util.HashSet;
import java.util.Set;

public class FindMaximumNumberOfStringPairs2744 {
    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> wordsSet = new HashSet<>();
        Set<String> resSet = new HashSet<>();
        int res = 0;
        for (String word : words) {
            wordsSet.add(word);
        }
        for (String word : words) {
            char[] chars = word.toCharArray();
            StringBuilder reversed = new StringBuilder(word);
            reversed.reverse();
            String reversedString = reversed.toString();
            if (resSet.contains(word) || chars[0] == chars[1]) {
                continue;
            } else {
                if (wordsSet.contains(reversedString)) {
                    res++;
                    resSet.add(word);
                    resSet.add(reversedString);
                }
            }
        }
        return res;
    }
}
