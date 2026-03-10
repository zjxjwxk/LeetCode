package com.zjxjwxk.leetcode._0063_Unique_Paths_II;

/**
 * 动态规划（空间优化）
 *
 * @author Xinkang Wu
 * @date 2026/3/10 20:52
 */
public class Solution {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (obstacleGrid[i][j] == 1) {
                    dp[j] = 0;
                    continue;
                }
                if (j >= 1) {
                    dp[j] += dp[j - 1];
                }
            }
        }
        return dp[n - 1];
    }
}
