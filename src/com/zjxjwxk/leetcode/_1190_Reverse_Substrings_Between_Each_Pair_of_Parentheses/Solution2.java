package com.zjxjwxk.leetcode._1190_Reverse_Substrings_Between_Each_Pair_of_Parentheses;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 预处理括号
 * 时间复杂度O(n)
 * @author Xinkang Wu
 * @date 2021/5/26 17:16
 */
public class Solution2 {

    public String reverseParentheses(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int[] pairs = new int[len];
        for (int i = 0; i < len; ++i) {
            if (chars[i] == '(') {
                stack.push(i);
            } else if (chars[i] == ')') {
                int j = stack.pop();
                pairs[j] = i;
                pairs[i] = j;
            }
        }
        int step = 1, index = 0;
        StringBuilder sb = new StringBuilder();
        while (index < len) {
            if (chars[index] == '(' || chars[index] == ')') {
                index = pairs[index];
                step = -step;
            } else {
                sb.append(chars[index]);
            }
            index += step;
        }
        return sb.toString();
    }
}
