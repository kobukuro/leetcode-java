public class ReverseWordsInAStringIII557 {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        // System.out.println(Arrays.toString(words));
        String res = "";
        for (String word : words) {
            StringBuilder reversed = new StringBuilder(word);
            reversed.reverse();
            res += reversed.toString() + " ";
        }
        return res.substring(0, res.length() - 1);
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        assert "s'teL ekat edoCteeL tsetnoc".equals(new ReverseWordsInAStringIII557().reverseWords(s));
    }
}
