package com.zjxjwxk.leetcode._1143_Longest_Common_Subsequence;

import java.util.Arrays;

/**
 * 动态规划（空间优化）
 *
 * @author Xinkang Wu
 * @date 2025/9/6 23:51
 */
public class Solution2 {

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[] dp = new int[n + 1];
        int[] preDp = new int[n + 1];
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[j] = preDp[j - 1] + 1;
                } else {
                    dp[j] = Math.max(dp[j - 1], preDp[j]);
                }
            }
            preDp = Arrays.copyOf(dp, dp.length);
        }
        return preDp[n];
    }
}
