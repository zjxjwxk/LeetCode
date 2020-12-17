package com.zjxjwxk.leetcode._0714_Best_Time_to_Buy_and_Sell_Stock_with_Transaction_Fee;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2020/12/17 09:11
 */
public class Solution {

    public int maxProfit(int[] prices, int fee) {
        int sell = 0, buy = -prices[0];
        for (int i = 1; i < prices.length; ++i) {
            sell = Math.max(sell, buy + prices[i] - fee);
            buy = Math.max(buy, sell - prices[i]);
        }
        return Math.max(sell, buy);
    }
}
