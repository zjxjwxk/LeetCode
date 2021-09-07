package com.zjxjwxk.leetcode._0005_Longest_Palindromic_Substring;

/**
 * 动态规划
 * 从后往前遍历
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(n^2)
 * @author Xinkang Wu
 * @date 2021/3/8 11:14
 */
public class Solution2 {

    public String longestPalindrome(String s) {
        int n = s.length(), begin = 0, maxLen = 1;
        char[] chArr = s.toCharArray();
        boolean[][] dp = new boolean[n][n];
        for (int i = n - 1; i >= 0; --i) {
            dp[i][i] = true;
            for (int j = i + 1; j < n; ++j) {
                int len = j - i + 1;
                if (chArr[i] == chArr[j]) {
                    if (len == 2) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
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
