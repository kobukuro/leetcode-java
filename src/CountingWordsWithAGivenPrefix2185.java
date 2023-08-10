public class CountingWordsWithAGivenPrefix2185 {
    public int prefixCount(String[] words, String pref) {
        int res = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                res += 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"pay", "attention", "practice", "attend"};
        String pref = "at";
        // 2
        System.out.println(new CountingWordsWithAGivenPrefix2185().prefixCount(words, pref));
    }
}
