package com.zjxjwxk.leetcode._0887_Super_Egg_Drop;

/**
 * 动态规划
 * 我的方法
 * @author Xinkang Wu
 * @date 2022/3/11 21:38
 */
public class Solution {

    public int superEggDrop(int k, int n) {
        int[][] dp = new int[k + 1][n + 1];
        for (int j = 1; j <= n; ++j) {
            dp[0][j] = Integer.MAX_VALUE;
        }
        for (int i = 1; i <= k; ++i) {
            for (int j = 1; j <= n; ++j) {
                int index = binarySearch(dp, i, j);
                if (index == -1) {
                    dp[i][j] = 1 + Math.max(dp[i - 1][index + 1], dp[i][j - index - 2]);
                } else {
                    dp[i][j] = 1 + Math.min(Math.max(dp[i - 1][index], dp[i][j - 1 - index]), Math.max(dp[i - 1][index + 1], dp[i][j - index - 2]));
                }
            }
        }
        return dp[k][n];
    }

    private int binarySearch(int[][] dp, int i, int j) {
        int left = 0, right = j - 1, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (dp[i - 1][mid] < dp[i][j - 1 - mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}
