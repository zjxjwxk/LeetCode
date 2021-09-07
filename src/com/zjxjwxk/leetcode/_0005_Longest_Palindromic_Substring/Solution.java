package com.zjxjwxk.leetcode._0005_Longest_Palindromic_Substring;

/**
 * 动态规划
 * 长度从小到大遍历
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(n^2)
 * @author Xinkang Wu
 * @date 2021/3/8 11:14
 */
public class Solution {

    public String longestPalindrome(String s) {
        int n = s.length(), begin = 0, maxLen = 1;
        char[] chArr = s.toCharArray();
        boolean[][] dp = new boolean[n][n];
        for (int len = 1; len <= n; ++len) {
            for (int i = 0; i + len - 1 < n; ++i) {
                int j = i + len - 1;
                if (len == 1) {
                    dp[i][j] = true;
                } else if (len == 2) {
                    dp[i][j] = (chArr[i] == chArr[j]);
                } else {
                    dp[i][j] = (chArr[i] == chArr[j] && dp[i + 1][j - 1]);
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
