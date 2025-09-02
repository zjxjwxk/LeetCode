package com.zjxjwxk.leetcode._0032_Longest_Valid_Parentheses;

/**
 * 贪心
 *
 * @author Xinkang Wu
 * @date 2025/9/2 22:16
 */
public class Solution4 {

    public int longestValidParentheses(String s) {
        int len = s.length(), maxLen = 0, left = 0, right = 0;
        if (len == 0) {
            return 0;
        }
        for (int i = 0; i < len; ++i) {
            if (s.charAt(i) == '(') {
                ++left;
            } else {
                ++right;
            }
            if (left == right) {
                maxLen = Math.max(maxLen, left << 1);
            } else if (right > left) {
                left = right = 0;
            }
        }
        left = right = 0;
        for (int i = len - 1; i >= 0; --i) {
            if (s.charAt(i) == '(') {
                ++left;
            } else {
                ++right;
            }
            if (left == right) {
                maxLen = Math.max(maxLen, left << 1);
            } else if (left > right) {
                left = right = 0;
            }
        }
        return maxLen;
    }
}
