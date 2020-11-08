package com.zjxjwxk.leetcode._0122_Best_Time_to_Buy_and_Sell_Stock_II;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2020/11/8 2:30 下午
 */
public class Solution2 {

    public int maxProfit(int[] prices) {
        int dp0, dp1;
        dp0 = 0;
        dp1 = -prices[0];
        for (int i = 1; i < prices.length; ++i) {
            int newDp0 = Math.max(dp0, dp1 + prices[i]);
            int newDp1 = Math.max(dp1, dp0 - prices[i]);
            dp0 = newDp0;
            dp1 = newDp1;
        }
        return dp0;
    }
}
