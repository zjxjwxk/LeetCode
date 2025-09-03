package com.zjxjwxk.leetcode._0062_Unique_Paths;

/**
 * 动态规划（空间优化）
 *
 * @author Xinkang Wu
 * @date 2020/12/10 08:54
 */
public class Solution3 {

    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 0; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                dp[j] += dp[j - 1];
            }
        }
        return dp[n - 1];
    }
}
