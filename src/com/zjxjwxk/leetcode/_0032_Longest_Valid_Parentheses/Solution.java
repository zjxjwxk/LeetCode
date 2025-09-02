package com.zjxjwxk.leetcode._0032_Longest_Valid_Parentheses;

/**
 * 栈
 *
 * @author Xinkang Wu
 * @date 2025/9/2 16:45
 */
public class Solution {

    public int longestValidParentheses(String s) {
        int len = s.length(), top = -1, maxLen = 0;
        if (len == 0) {
            return 0;
        }
        int[][] stack = new int[len + 1][2];
        stack[++top] = new int[]{-1, 1};
        for (int i = 0; i < len; ++i) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack[++top] = new int[]{i, -1};
            } else {
                if (stack[top][1] == -1) {
                    --top;
                    maxLen = Math.max(maxLen, i - stack[top][0]);
                } else {
                    stack[++top] = new int[]{i, 1};
                }
            }
        }
        return maxLen;
    }
}
