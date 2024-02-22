import java.util.ArrayList;
import java.util.List;

public class CheckIfAStringIsAnAcronymOfWords2828 {
    public boolean isAcronym(List<String> words, String s) {
        String acronym = "";
        for (String word : words) {
            char[] chars = word.toCharArray();
            acronym += chars[0];
        }
        return acronym.equals(s);
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("alice");
        words.add("bob");
        words.add("charlie");
        String s = "abc";
        assert new CheckIfAStringIsAnAcronymOfWords2828().isAcronym(words, s);
    }
}
