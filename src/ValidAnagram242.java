// String, Sorting, Hash Table

import java.util.Arrays;

public class ValidAnagram242 {
    /*
        Time complexity: O(n log n).
        Assume that n is the length of s, sorting costs O(n log n)
        and comparing two strings costs O(n).
        Sorting time dominates and the overall time complexity is O(n log n).

        Space complexity: O(1).
        Space depends on the sorting implementation which,
        usually, costs O(1) auxiliary space if heapsort is used.
     */
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars, tChars);
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(new ValidAnagram242().isAnagram(s, t)); // true
    }
}
