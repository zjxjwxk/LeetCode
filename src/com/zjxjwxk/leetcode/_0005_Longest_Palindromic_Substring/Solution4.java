package com.zjxjwxk.leetcode._0005_Longest_Palindromic_Substring;

/**
 * 动态规划（空间优化）
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(n)
 *
 * @author Xinkang Wu
 * @date 2025/9/6 00:14
 */
public class Solution4 {

    public String longestPalindrome(String s) {
        int len = s.length(), maxLen = 1, maxStart = 0;
        boolean[] dp = new boolean[len];
        for (int i = len - 1; i >= 0; --i) {
            dp[i] = true;
            for (int j = len - 1; j > i; --j) {
                dp[j] = s.charAt(i) == s.charAt(j) && dp[j - 1];
                if (dp[j] && (j - i + 1) > maxLen) {
                    maxLen = j - i + 1;
                    maxStart = i;
                }
            }
        }
        return s.substring(maxStart, maxStart + maxLen);
    }
}
