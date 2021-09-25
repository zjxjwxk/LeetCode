package com.zjxjwxk.leetcode._0583_Delete_Operation_for_Two_Strings;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2021/9/25 11:49
 */
public class Solution {

    public int minDistance(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        int[][] dp = new int[n + 1][m + 1];
        char[] chArr1 = word1.toCharArray();
        char[] chArr2 = word2.toCharArray();
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= m; ++j) {
                if (chArr1[i - 1] == chArr2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return n + m - (dp[n][m] << 1);
    }
}
