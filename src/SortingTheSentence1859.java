import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;


public class SortingTheSentence1859 {
    private static class Pair {
        char position;
        String word;

        Pair(char position, String word) {
            this.position = position;
            this.word = word;
        }
    }

    public String sortSentence(String s) {
        String[] words = s.split(" ");
        List<Pair> wordAndPos = new ArrayList<>();

        for (String word : words) {
            wordAndPos.add(new Pair(word.charAt(word.length() - 1), word.substring(0, word.length() - 1)));
        }

        wordAndPos.sort(Comparator.comparingInt(p -> p.position));

        StringBuilder res = new StringBuilder();
        for (Pair word : wordAndPos) {
            res.append(word.word).append(" ");
        }

        return res.toString().trim();
    }

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        // This is a sentence
        System.out.println(new SortingTheSentence1859().sortSentence(s));
    }


}
