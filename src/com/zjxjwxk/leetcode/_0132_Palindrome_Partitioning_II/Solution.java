package com.zjxjwxk.leetcode._0132_Palindrome_Partitioning_II;

import java.util.Arrays;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2021/3/8 15:54
 */
public class Solution {

    public int minCut(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for (int len = 1; len <= n; ++len) {
            for (int i = 0; i + len - 1 < n; ++i) {
                int j = i + len - 1;
                if (len == 1) {
                    dp[i][j] = true;
                } else if (len == 2) {
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                } else {
                    dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1];
                }
            }
        }
        int[] f = new int[n];
        Arrays.fill(f, Integer.MAX_VALUE);
        for (int i = 0; i < n; ++i) {
            if (dp[0][i]) {
                f[i] = 0;
            } else {
                for (int j = i; j >= 0; --j) {
                    if (dp[j][i]) {
                        f[i] = Math.min(f[i], f[j - 1] + 1);
                    }
                }
            }
        }
        return f[n - 1];
    }
}
