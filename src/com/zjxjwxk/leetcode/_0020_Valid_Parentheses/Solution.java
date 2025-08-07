package com.zjxjwxk.leetcode._0020_Valid_Parentheses;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zjxjwxk
 */
public class Solution {

    public boolean isValid(String s) {
        if (s == null || s.isEmpty() || ((s.length() & 1) == 1)) {
            return false;
        }
        int len = s.length(), top = -1;
        Map<Character, Character> bracketMap = new HashMap<Character, Character>(){{
            put('(', ')');
            put('[', ']');
            put('{', '}');
        }};
        char[] stack = new char[len];
        for (int i = 0; i < len; ++i) {
            char ch = s.charAt(i);
            if (bracketMap.containsKey(ch)) {
                stack[++top] = ch;
            } else {
                if (top == -1 || bracketMap.get(stack[top]) != ch) {
                    return false;
                }
                --top;
            }
        }
        return top == -1;
    }
}
