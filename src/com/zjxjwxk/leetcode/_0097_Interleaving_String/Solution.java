package com.zjxjwxk.leetcode._0097_Interleaving_String;

/**
 * 动态规划（空间优化）
 *
 * @author Xinkang Wu
 * @date 2026/3/11 21:58
 */
public class Solution {

    public boolean isInterleave(String s1, String s2, String s3) {
        int len1 = s1.length(), len2 = s2.length(), len3 = s3.length();
        if (len1 + len2 != len3) {
            return false;
        }
        boolean[] dp = new boolean[len2 + 1];
        dp[0] = true;
        for (int i = 0; i <= len1; ++i) {
            for (int j = 0; j <= len2; ++j) {
                if (i > 0) {
                    dp[j] = s1.charAt(i - 1) == s3.charAt(i + j - 1) && dp[j];
                }
                if (j > 0) {
                    dp[j] = dp[j] || s2.charAt(j - 1) == s3.charAt(i + j - 1) && dp[j - 1];
                }
            }
        }
        return dp[len2];
    }
}
