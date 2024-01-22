import java.util.HashSet;
import java.util.Set;

public class FirstLetterToAppearTwice2351 {
    public char repeatedCharacter(String s) {
        Set<Character> hashSet = new HashSet<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (!hashSet.contains(c)) {
                hashSet.add(c);
            } else {
                return c;
            }
        }
        return 'a';
    }

    public static void main(String[] args) {
        String s = "abccbaacz";
        // c
        System.out.println(new FirstLetterToAppearTwice2351().repeatedCharacter(s));
    }
}
