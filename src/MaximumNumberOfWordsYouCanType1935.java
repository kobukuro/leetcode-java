import java.util.HashSet;
import java.util.Set;

public class MaximumNumberOfWordsYouCanType1935 {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        Set<Character> broken = new HashSet<>();
        char[] brokenChars = brokenLetters.toCharArray();
        for (char c : brokenChars) {
            broken.add(c);
        }
        // System.out.println(broken.size());
        int res = 0;
        for (String word : words) {
            boolean canFullyType = true;
            char[] chars = word.toCharArray();
            for (char c : chars) {
                if (broken.contains(c)) {
                    canFullyType = false;
                    break;
                }
            }
            if (canFullyType) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String text = "hello world";
        String brokenLetters = "ad";
        // 1
        System.out.println(new MaximumNumberOfWordsYouCanType1935().canBeTypedWords(text, brokenLetters));
    }
}
