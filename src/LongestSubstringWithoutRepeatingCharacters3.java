// Sliding Window, Hash Table, String

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters3 {
    /*
        Time complexity : O(2n) = O(n). In the worst case each character will be visited twice by l and r.
        Space complexity : O(n)
     */
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int l = 0;
        HashSet<Character> hashSet = new HashSet<>();
        for (int r = 0; r < s.length(); r++) {
            while (hashSet.contains(s.charAt(r))) {
                hashSet.remove(s.charAt(l));
                l++;
            }
            hashSet.add(s.charAt(r));
            res = Math.max(r - l + 1, res);
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(new LongestSubstringWithoutRepeatingCharacters3().lengthOfLongestSubstring(s));
    }
}
