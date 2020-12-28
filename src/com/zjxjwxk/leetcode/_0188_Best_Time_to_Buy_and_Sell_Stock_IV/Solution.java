package com.zjxjwxk.leetcode._0188_Best_Time_to_Buy_and_Sell_Stock_IV;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2020/12/28 17:18
 */
public class Solution {

    public int maxProfit(int k, int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int len = prices.length, ans = 0;
        k = Math.min(k, len / 2);
        int[][][] dp = new int[len][k + 1][2];
        for (int i = 0; i <= k; ++i) {
            dp[0][i][0] = 0;
            dp[0][i][1] = -prices[0];
        }
        for (int i = 1; i < len; ++i) {
            dp[i][0][1] = Math.max(dp[i - 1][0][1], dp[i - 1][0][0] - prices[i]);
            for (int j = 1; j <= k; ++j) {
                dp[i][j][0] = Math.max(dp[i - 1][j][0], dp[i - 1][j - 1][1] + prices[i]);
                dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i - 1][j][0] - prices[i]);
            }
        }
        for (int i = 0; i <= k; ++i) {
            ans = Math.max(ans, dp[len - 1][i][0]);
        }
        return ans;
    }
}
