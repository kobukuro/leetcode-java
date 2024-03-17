public class TruncateSentence1816 {
    public String truncateSentence(String s, int k) {
        String res = "";
        String[] words = s.split(" ");
        for (int i = 0; i < k; i++) {
            res = res.concat(words[i]);
            res = res.concat(" ");
        }
        return res.substring(0, res.length() - 1);
    }

    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        // Hello how are you
        System.out.println(new TruncateSentence1816().truncateSentence(s, k));
    }
}
