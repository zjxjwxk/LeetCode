package com.zjxjwxk.leetcode._0629_K_Inverse_Pairs_Array;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2021/11/11 16:14
 */
public class Solution {

    private final static int MOD = 1000000007;

    public int kInversePairs(int n, int k) {
        int[][] dp = new int[2][k + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; ++i) {
            for (int j = 0; j <= k; ++j) {
                int cur = i & 1, pre = cur ^ 1;
                dp[cur][j] = (j - 1 >= 0 ? dp[cur][j - 1] : 0) - (j - i >= 0 ? dp[pre][j - i] : 0) + dp[pre][j];
                if (dp[cur][j] > MOD) {
                    dp[cur][j] -= MOD;
                } else if (dp[cur][j]< 0) {
                    dp[cur][j] += MOD;
                }
            }
        }
        return dp[n & 1][k];
    }
}
