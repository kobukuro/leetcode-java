// String, Stack

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses20 {
    /*
        Time complexity : O(n)
        because we simply traverse the given string one character at a time
        and push and pop operations on a stack take O(1) time.

        Space complexity : O(n)
        as we push all opening brackets onto the stack
        and in the worst case, we will end up pushing all the brackets onto the stack. e.g. ((((((((((.
     */
    public boolean isValid(String s) {
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put(']', '[');
        mapping.put('}', '{');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            if (!mapping.containsKey(chr)) {
                stack.push(chr);
            } else {
                if (stack.empty()) {
                    return false;
                } else {
                    if (mapping.get(chr) != stack.pop()) {
                        return false;
                    }
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(new ValidParentheses20().isValid(s));
        // true
    }
}
