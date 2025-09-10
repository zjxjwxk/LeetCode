package com.zjxjwxk.leetcode._0072_Edit_Distance;

/**
 * 动态规划（空间优化）
 *
 * @author Xinkang Wu
 * @date 2025/9/10 19:54
 */
public class Solution {

    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[] preDp = new int[n + 1];
        for (int j = 1; j <= n; ++j) {
            preDp[j] = j;
        }
        for (int i = 1; i <= m; ++i) {
            int[] dp = new int[n + 1];
            dp[0] = i;
            for (int j = 1; j <= n; ++j) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[j] = Math.min(Math.min(dp[j - 1] + 1, preDp[j] + 1), preDp[j - 1]);
                } else {
                    dp[j] = Math.min(Math.min(dp[j - 1] + 1, preDp[j] + 1), preDp[j - 1] + 1);
                }
            }
            preDp = dp;
        }
        return preDp[n];
    }
}
