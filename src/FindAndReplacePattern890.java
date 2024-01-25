import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAndReplacePattern890 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            Map<Character, Character> mapping = new HashMap<>();
            char[] wordChars = word.toCharArray();
            char[] patternChars = pattern.toCharArray();
            boolean isValid = true;
            for (int i = 0; i < wordChars.length; i++) {
                if (mapping.containsKey(wordChars[i])) {
                    if (mapping.get(wordChars[i]) != patternChars[i]) {
                        isValid = false;
                        break;
                    }
                } else {
                    for (Map.Entry<Character, Character> entry : mapping.entrySet()) {
                        if (entry.getValue() == patternChars[i]) {
                            isValid = false;
                            break;
                        }
                    }
                    if (!isValid) {
                        break;
                    } else {
                        mapping.put(wordChars[i], patternChars[i]);
                    }
                }
            }
            if (isValid) {
                res.add(word);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";
        // ["mee","aqq"]
        System.out.println(new FindAndReplacePattern890().findAndReplacePattern(words, pattern));
    }
}
