// String, Dynamic Programming
public class PalindromicSubstrings647 {
    /*
        Time Complexity : O(n^2)
        Space Complexity : O(1).
     */
    public int countSubstrings(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int l = i;
            int r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                res++;
                l--;
                r++;
            }
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                res++;
                l--;
                r++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(new PalindromicSubstrings647().countSubstrings(s)); // 3
    }
}
