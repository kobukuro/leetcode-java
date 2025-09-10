// Tags: String, Hash Set
package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones771 {
    /*
    Time complexity: O(J + S)
    Breakdown:
    -  First loop: Iterates through the jewels string of length J, adding each character to the HashSet
       -  Each add() operation on HashSet takes O(1) average time
       -  Total: O(J)
    -  Second loop: Iterates through the stones string of length S, checking if each character exists in the HashSet
       -  Each contains() operation on HashSet takes O(1) average time
       -  Total: O(S)
    -  Overall: O(J) + O(S) = O(J + S)
    Where J is the length of the jewels string and S is the length of the stones string.

    Space complexity: O(J)
    Breakdown:
    -  HashSet storage: The jewelsTypes HashSet stores at most J unique characters from the jewels string
        -  In the worst case, all characters in jewels are unique, requiring O(J) space
    -  Other variables: res and loop variables use O(1) constant space
    -  Overall: O(J)
     */
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelsTypes = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            jewelsTypes.add(jewels.charAt(i));
        }
        int res = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewelsTypes.contains(stones.charAt(i))) {
                res++;
            }
        }
        return res;
    }
}
