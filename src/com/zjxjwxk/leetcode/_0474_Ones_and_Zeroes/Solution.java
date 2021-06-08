package com.zjxjwxk.leetcode._0474_Ones_and_Zeroes;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2021/6/6 12:15
 */
public class Solution {

    public int findMaxForm(String[] strs, int m, int n) {
        int len = strs.length;
        int[][] counts = new int[len + 1][2];
        for (int i = 1; i <= len; ++i) {
            for (int j = 0; j < strs[i - 1].length(); ++j) {
                ++counts[i][strs[i - 1].charAt(j) - '0'];
            }
        }
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= len; ++i) {
            for (int j = m; j >= counts[i][0]; --j) {
                for (int k = n; k >= counts[i][1]; --k) {
                    dp[j][k] = Math.max(dp[j][k], dp[j - counts[i][0]][k - counts[i][1]] + 1);
                }
            }
        }
        return dp[m][n];
    }
}
