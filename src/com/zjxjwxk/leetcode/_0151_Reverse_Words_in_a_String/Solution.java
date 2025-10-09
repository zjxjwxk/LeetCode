package com.zjxjwxk.leetcode._0151_Reverse_Words_in_a_String;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈
 *
 * @author Xinkang Wu
 * @date 2025/10/9 15:04
 */
public class Solution {

    public String reverseWords(String s) {
        Deque<StringBuilder> stack = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            } else if (sb.length() != 0) {
                stack.push(sb);
                sb = new StringBuilder();
            }
        }
        if (sb.length() != 0) {
            stack.push(sb);
        }
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            if (ans.length() != 0) {
                ans.append(' ');
            }
            ans.append(stack.pop());
        }
        return ans.toString();
    }
}
