package com.zjxjwxk.leetcode._0005_Longest_Palindromic_Substring;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2021/3/8 11:14
 */
public class Solution {

    public String longestPalindrome(String s) {
        int n = s.length(), begin = 0, maxLen = 1;
        boolean[][] dp = new boolean[n][n];
        for (int len = 1; len <= n; ++len) {
            for (int i = 0; i + len - 1 < n; ++i) {
                int j = i + len - 1;
                if (len == 1) {
                    dp[i][j] = true;
                } else if (len == 2) {
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]);
                }
                if (dp[i][j] && len > maxLen) {
                    begin = i;
                    maxLen = len;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }
}
