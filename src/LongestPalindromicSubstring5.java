// String, Dynamic Programming
public class LongestPalindromicSubstring5 {
    /*
        Time Complexity : O(n^2)
        Since expanding a palindrome around its center could take O(n) time,
        the overall complexity is O(n^2).

        Space Complexity : O(1).
     */
    public String longestPalindrome(String s) {
        int resLen = 0;
        int resLeft = -1;
        int resRight = -1;
        for (int i = 0; i < s.length(); i++) {
            int l = i;
            int r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                int len = r - l + 1;
                if (len > resLen) {
                    resLen = len;
                    resLeft = l;
                    resRight = r;
                }
                l--;
                r++;
            }
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                int len = r - l + 1;
                if (len > resLen) {
                    resLen = len;
                    resLeft = l;
                    resRight = r;
                }
                l--;
                r++;
            }
        }
        return s.substring(resLeft, resRight + 1);
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(new LongestPalindromicSubstring5().longestPalindrome(s)); // bab
    }
}
