// Array, Hash Table, String, Sorting

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class GroupAnagrams49 {
    /*
        Time Complexity: O(NKlogK), where N is the length of strs,
        and K is the maximum length of a string in strs.
        The outer loop has complexity O(N) as we iterate through each string.
        Then, we sort each string in O(KlogK) time.

        Space Complexity: O(NK), the total information content stored in mapping.
        It's O(NK) because every word inside the input array, are arrays of characters.
        At the end of the algorithm, we return Lists of size N,
        where each element of those lists are arrays of characters - hence O(NK).
        That's different from a list of Integers - each Integer have a specific number of storage units,
        and that's why a list of Integers are O(N) space. At the end,
        it does not matter if the Integer in the list is 1 or 2147483647,
        they all represent the same storage unit(32 bits).
        But in a list of arrays of chars,
        every array of char inside that list occupies storage based on the size of the word.
        It's not fixed. Every char in a word in that list occupies 2 bytes.
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapping = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);
            if (!mapping.containsKey(sortedString)) {
                mapping.put(sortedString, new ArrayList<>());
            }
            mapping.get(sortedString).add(s);
        }
        return new ArrayList<>(mapping.values());
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(new GroupAnagrams49().groupAnagrams(strs));
        // [[eat, tea, ate], [bat], [tan, nat]]
    }
}
