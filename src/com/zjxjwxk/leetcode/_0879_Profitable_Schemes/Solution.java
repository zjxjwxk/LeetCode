package com.zjxjwxk.leetcode._0879_Profitable_Schemes;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2021/6/10 21:42
 */
public class Solution {

    static final int MOD = (int) 1e9 + 7;

    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int len = group.length, ans = 0;
        int[][] dp = new int[n + 1][minProfit + 1];
        dp[0][0] = 1;
        for (int i = 0; i < len; ++i) {
            for (int j = n; j >= group[i]; --j) {
                for (int k = minProfit; k >= 0; --k) {
                    dp[j][k] = (dp[j][k] + dp[j - group[i]][Math.max(0, k - profit[i])]) % MOD;
                }
            }
        }
        for (int j = 0; j <= n; ++j) {
            ans = (ans + dp[j][minProfit]) % MOD;
        }
        return ans;
    }
}
