package com.zjxjwxk.leetcode._0032_Longest_Valid_Parentheses;

/**
 * 栈（简化版）
 *
 * @author Xinkang Wu
 * @date 2025/9/2 16:45
 */
public class Solution2 {

    public int longestValidParentheses(String s) {
        int len = s.length(), top = -1, maxLen = 0;
        if (len == 0) {
            return 0;
        }
        int[] stack = new int[len + 1];
        stack[++top] = -1;
        for (int i = 0; i < len; ++i) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack[++top] = i;
            } else {
                --top;
                if (top == -1) {
                    stack[++top] = i;
                } else {
                    maxLen = Math.max(maxLen, i - stack[top]);
                }
            }
        }
        return maxLen;
    }
}
