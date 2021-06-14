package com.zjxjwxk.leetcode._0279_Perfect_Squares;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2021/6/14 23:41
 */
public class Solution {

    public int numSquares(int n) {
        int maxSquare = (int) Math.sqrt(n);
        int[] dp = new int[n + 1];
        for (int i = 1; i <= maxSquare; ++i) {
            int square = i * i, min = Integer.MAX_VALUE;
            for (int j = square; j <= n; ++j) {
                min = Math.min(min, dp[j - square]);
                if (dp[j] != 0) {
                    dp[j] = Math.min(dp[j], dp[j - square] + 1);
                } else {
                    dp[j] = dp[j - square] + 1;
                }
            }
        }
        return dp[n];
    }
}
