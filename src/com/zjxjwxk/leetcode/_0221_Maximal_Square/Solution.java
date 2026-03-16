package com.zjxjwxk.leetcode._0221_Maximal_Square;

/**
 * 动态规划
 *
 * @author Xinkang Wu
 * @date 2026/3/16 15:31
 */
public class Solution {

    public int maximalSquare(char[][] matrix) {
        int m = matrix.length, n = matrix[0].length, maxLen = 0;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                char num = matrix[i - 1][j - 1];
                if (num == '1') {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j])) + 1;
                    maxLen = Math.max(maxLen, dp[i][j]);
                }
            }
        }
        return maxLen * maxLen;
    }
}
