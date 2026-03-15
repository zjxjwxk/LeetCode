package com.zjxjwxk.leetcode._0188_Best_Time_to_Buy_and_Sell_Stock_IV;

/**
 * 动态规划（空间优化，分为两个数组）
 *
 * @author Xinkang Wu
 * @date 2026/3/15 22:40
 */
public class Solution3 {

    public int maxProfit(int k, int[] prices) {
        int len = prices.length;
        k = Math.min(k, len >> 1);
        if (k == 0) {
            return 0;
        }
        int[] buy = new int[k];
        int[] sell = new int[k];
        for (int i = 0; i < k; ++i) {
            buy[i] = -prices[0];
        }
        for (int i = 1; i < len; ++i) {
            for (int j = 0; j < k; ++j) {
                if (j == 0) {
                    buy[j] = Math.max(buy[j], -prices[i]);
                } else {
                    buy[j] = Math.max(buy[j], sell[j - 1] - prices[i]);
                }
                sell[j] = Math.max(sell[j], buy[j] + prices[i]);
            }
        }
        return sell[k - 1];
    }
}
