// String, Sliding Window, Hash Table

import java.util.Map;
import java.util.HashMap;

public class LongestRepeatingCharacterReplacement424 {
    private int maxFreqValue(Map<Character, Integer> freq) {
        int res = 0;
        for (int val : freq.values()) {
            res = Math.max(res, val);
        }
        return res;
    }

    /*
        Let n be the number of characters in the string and m be the number of unique characters.
        Time complexity:O(nm).
# We iterate over each unique character once, which requires O(m) time.
# We move a sliding window for each unique character from left to right of the string.
# As the window moves, each character of the string is visited at most two times.
# Once when it enters the window and again when it leaves the window. This adds
# O(n) time complexity for each iteration. So the final time complexity is
# O(nm). For all uppercase English letters, the maximum value of m would be 26.

# Space complexity:O(m).
     */
    public int characterReplacement(String s, int k) {
        int res = 0;
        int l = 0;
        Map<Character, Integer> freq = new HashMap<>();
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            while (r - l + 1 - this.maxFreqValue(freq) > k) {
                char leftChar = s.charAt(l);
                freq.put(leftChar, freq.get(leftChar) - 1);
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(new LongestRepeatingCharacterReplacement424().characterReplacement(s, k)); // 4
    }
}
