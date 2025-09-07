// Tags: Memoization, Dynamic Programming
package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumber509 {
    private int fibRecursive(int n, Map<Integer, Integer> memo) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        memo.put(n, this.fibRecursive(n - 1, memo) + this.fibRecursive(n - 2, memo));
        return memo.get(n);
    }

    /*
     Time complexity: O(N).
     Each number, starting at 2 up to and including N, is visited, computed and then stored for O(1) access later on.

     Space complexity: O(N).
     The size of the stack in memory is proportional to N.
     Also, the memoization hash table is used, which occupies O(N) space.
     */
    public int fibMemoization(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return this.fibRecursive(n, memo);
    }

    /*
     Time complexity: O(N).
     Each value from 2 to N is computed once.
     Thus, the time it takes to find the answer is directly
     proportional to N where N is the Fibonacci Number we are looking to compute.

     Space complexity: O(1).
     This requires 1 unit of space for the integer N and 3 units of space to store the computed values
     (curr, prev1, and prev2) for every loop iteration.
     The amount of space used is independent of N, so this approach uses a constant amount of space.
     */
    public int fibDp(int n) {
        if (n <= 1) {
            return n;
        }
        int curr = 0;
        int prev1 = 1;
        int prev2 = 0;
        for (int i = 2; i <= n; i++) {
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }
}
