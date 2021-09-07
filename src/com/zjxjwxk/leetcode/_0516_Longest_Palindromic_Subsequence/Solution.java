package com.zjxjwxk.leetcode._0516_Longest_Palindromic_Subsequence;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2021/9/7 14:35
 */
public class Solution {

    public int longestPalindromeSubseq(String s) {
        int len = s.length();
        int[][] dp = new int[len][len];
        char[] chArr = s.toCharArray();
        for (int i = len - 1; i >= 0; --i) {
            dp[i][i] = 1;
            for (int j = i + 1; j < len; ++j) {
                if (chArr[i] == chArr[j]) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][len - 1];
    }
}
