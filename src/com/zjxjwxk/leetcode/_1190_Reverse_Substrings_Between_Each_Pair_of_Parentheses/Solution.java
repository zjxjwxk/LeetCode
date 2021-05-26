package com.zjxjwxk.leetcode._1190_Reverse_Substrings_Between_Each_Pair_of_Parentheses;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 栈
 * 时间复杂度O(n^2)
 * @author Xinkang Wu
 * @date 2021/5/26 17:16
 */
public class Solution {

    public String reverseParentheses(String s) {
        char[] chars = s.toCharArray();
        Deque<String> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : chars) {
            if (ch == '(') {
                stack.push(sb.toString());
                sb.setLength(0);
            } else if (ch == ')') {
                sb.reverse();
                sb.insert(0, stack.pop());
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
