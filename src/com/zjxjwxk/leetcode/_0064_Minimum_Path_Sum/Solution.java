package com.zjxjwxk.leetcode._0064_Minimum_Path_Sum;

/**
 * 动态规划（空间优化）
 *
 * @author Xinkang Wu
 * @date 2025/9/4 21:55
 */
public class Solution {

    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] dp = new int[n];
        dp[0] = grid[0][0];
        for (int j = 1; j < n; ++j) {
            dp[j] = dp[j - 1] + grid[0][j];
        }
        for (int i = 1; i < m; ++i) {
            dp[0] += grid[i][0];
            for (int j = 1; j < n; ++j) {
                dp[j] = grid[i][j] + Math.min(dp[j], dp[j - 1]);
            }
        }
        return dp[n - 1];
    }
}
