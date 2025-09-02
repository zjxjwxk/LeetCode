package com.zjxjwxk.leetcode._0032_Longest_Valid_Parentheses;

/**
 * 动态规划
 *
 * @author Xinkang Wu
 * @date 2025/9/2 22:01
 */
public class Solution3 {

    public int longestValidParentheses(String s) {
        int len = s.length(), maxLen = 0;
        if (len == 0) {
            return 0;
        }
        int[] dp = new int[len + 1];
        for (int i = 1; i < len; ++i) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i + 1] = dp[i - 1] + 2;
                } else if (dp[i] > 0 && i >= dp[i] + 1 && s.charAt(i - dp[i] - 1) == '(') {
                    dp[i + 1] = dp[i - dp[i] - 1] + dp[i] + 2;
                }
                maxLen = Math.max(maxLen, dp[i + 1]);
            }
        }
        return maxLen;
    }
}
