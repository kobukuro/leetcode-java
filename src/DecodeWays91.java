// String, Dynamic Programming

import java.util.HashMap;
import java.util.Map;

public class DecodeWays91 {

    private boolean canDecode(String s) {
        if (s.charAt(0) == '0') {
            return false;
        }
        return Integer.parseInt(s) >= 1 && Integer.parseInt(s) <= 26;
    }

    /*
        Time Complexity: O(N), where N is length of the string.
        Memoization helps in pruning the recursion tree and hence decoding for an index only once.
        Thus, this solution is linear time complexity.

        Space Complexity: O(N).
        The dictionary used for memoization would take the space equal to the length of the string.
        There would be an entry for each index value.
        The recursion stack would also be equal to the length of the string.
     */
    private int dfs(String s, int start, Map<Integer, Integer> memo) {
        if (memo.containsKey(start)) {
            return memo.get(start);
        }
        if (start == s.length()) {
            return 1;
        }
        int forEnd = start + 1;
        if (s.substring(start).length() >= 2) {
            forEnd = start + 2;
        }
        int val = 0;
        for (int end = start + 1; end <= forEnd; end++) {
            if (this.canDecode(s.substring(start, end))) {
                val += this.dfs(s, end, memo);
            }
        }
        memo.put(start, val);
        return memo.get(start);
    }


    public int numDecodingsCallRecursive(String s) {
        Map<Integer, Integer> memo = new HashMap<>();
        return this.dfs(s, 0, memo);
    }

    public static void main(String[] args) {
        String s = "226";
        System.out.println(new DecodeWays91().numDecodingsCallRecursive(s)); // 3
    }
}
