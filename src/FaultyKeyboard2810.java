public class FaultyKeyboard2810 {
    public String finalString(String s) {
        String res = "";
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c != 'i') {
                res += c;
            } else {
                StringBuilder reversed = new StringBuilder(res);
                reversed.reverse();
                res = reversed.toString();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "string";
        assert "rtsng".equals(new FaultyKeyboard2810().finalString(s));
    }
}
