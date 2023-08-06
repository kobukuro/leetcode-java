public class CheckIfTwoStringArraysAreEquivalent1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String string1 = "";
        for (String word : word1) {
            string1 = string1.concat(word);
        }
        String string2 = "";
        for (String word : word2) {
            string2 = string2.concat(word);
        }
        return string1.equals(string2);
    }

    public static void main(String[] args) {
        String[] word1 = new String[]{"ab", "c"};
        String[] word2 = new String[]{"a", "bc"};
        // true
        System.out.println(new CheckIfTwoStringArraysAreEquivalent1662().arrayStringsAreEqual(word1, word2));
    }
}
