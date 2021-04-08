package com.zjxjwxk.leetcode._1143_Longest_Common_Subsequence;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2021/4/8 22:09
 */
public class Solution {

    public int longestCommonSubsequence(String text1, String text2) {
        char[] chars1 = text1.toCharArray();
        char[] chars2 = text2.toCharArray();
        int[][] dp = new int[chars1.length + 1][chars2.length + 1];
        for (int i = 1; i < chars1.length + 1; ++i) {
            for (int j = 1; j < chars2.length + 1; ++j) {
                if (chars1[i - 1] == chars2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[chars1.length][chars2.length];
    }
}
