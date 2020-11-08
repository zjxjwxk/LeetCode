package com.zjxjwxk.leetcode._0122_Best_Time_to_Buy_and_Sell_Stock_II;

/**
 * 一次遍历
 * @author Xinkang Wu
 * @date 2020/11/8 12:20 上午
 */
public class Solution {

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; ++i) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
