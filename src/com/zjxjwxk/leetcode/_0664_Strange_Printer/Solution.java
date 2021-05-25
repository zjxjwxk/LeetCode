package com.zjxjwxk.leetcode._0664_Strange_Printer;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2021/5/25 21:28
 */
public class Solution {

    public int strangePrinter(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        int[][] dp = new int[len][len];
        for (int i = len - 1; i >= 0; --i) {
            dp[i][i] = 1;
            for (int j = i + 1; j < len; ++j) {
                if (chars[i] == chars[j]) {
                    dp[i][j] = dp[i][j - 1];
                } else {
                    dp[i][j] = Integer.MAX_VALUE;
                    for (int k = i; k < j; ++k) {
                        dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k + 1][j]);
                    }
                }
            }
        }
        return dp[0][len - 1];
    }
}
