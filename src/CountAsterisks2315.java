public class CountAsterisks2315 {
    public int countAsterisks(String s) {
        String[] words = s.split("\\|");
        int res = 0;
        for (int i = 0; i < words.length; i = i + 2) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == '*') {
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "l|*e*et|c**o|*de|";
        // 2
        System.out.println(new CountAsterisks2315().countAsterisks(s));
    }
}
