package com.zjxjwxk.leetcode._0221_Maximal_Square;

/**
 * 动态规划（空间优化）
 *
 * @author Xinkang Wu
 * @date 2026/3/16 15:31
 */
public class Solution2 {

    public int maximalSquare(char[][] matrix) {
        int m = matrix.length, n = matrix[0].length, maxLen = 0;
        int[] dp = new int[n + 1];
        for (int i = 1; i <= m; ++i) {
            int[] nextDp = new int[n + 1];
            for (int j = 1; j <= n; ++j) {
                char num = matrix[i - 1][j - 1];
                if (num == '1') {
                    nextDp[j] = Math.min(dp[j - 1], Math.min(nextDp[j - 1], dp[j])) + 1;
                    maxLen = Math.max(maxLen, nextDp[j]);
                } else {
                    nextDp[j] = 0;
                }
            }
            dp = nextDp;
        }
        return maxLen * maxLen;
    }
}
