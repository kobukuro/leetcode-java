// Tags: Array, Hash Set
package com.leetcode.easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity1436 {
    /*
    Given n as the length of paths,

    Time complexity: O(n)
    We first iterate over paths to populate hasOutgoing, this costs O(n).
    Next, we iterate over paths again to find the answer, checking at each step whether candidate is in the hash set, which takes O(1). Thus the iteration costs O(n).

    Space complexity: O(n)
    hasOutgoing will grow to a size of O(n).
     */
    public String destCity(List<List<String>> paths) {
        Set<String> hasOutgoing = new HashSet<>();
        for (List<String> path : paths) {
            hasOutgoing.add(path.get(0));
        }
        for (List<String> path : paths) {
            String candidate = path.get(1);
            if (!hasOutgoing.contains(candidate)) {
                return candidate;
            }
        }
        return "";
    }
}
