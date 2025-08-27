// Tags: String, Stack
package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses20 {
    /*
        Time complexity: O(n)
        because we simply traverse the given string one character at a time
        and push and pop operations on a stack take O(1) time.

        Space complexity: O(n) as we push all opening brackets onto the stack
        and in the worst case, we will end up pushing all the brackets onto the stack. e.g. ((((((((((.
     */
    public boolean isValid(String s) {
        Map<Character, Character> mapping = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        mapping.put(')', '(');
        mapping.put(']', '[');
        mapping.put('}', '{');
        for (char c : s.toCharArray()) {
            if (mapping.containsKey(c)) {
                if (stack.isEmpty() || mapping.get(c) != stack.pop()) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
