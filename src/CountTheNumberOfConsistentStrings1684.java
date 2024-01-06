import java.util.HashSet;
import java.util.Set;

public class CountTheNumberOfConsistentStrings1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> setChars = new HashSet<>();
        char[] charsOfAllowed = allowed.toCharArray();
        for (char c : charsOfAllowed) {
            setChars.add(c);
        }
        // System.out.println(setChars.size());
        int res = 0;
        for (String word : words) {
            boolean isConsistent = true;
            char[] charsOfWord = word.toCharArray();
            for (char c : charsOfWord) {
                if (!setChars.contains(c)) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = new String[]{"ad", "bd", "aaab", "baa", "badab"};
        // 2
        System.out.println(new CountTheNumberOfConsistentStrings1684().countConsistentStrings(allowed, words));
    }
}
