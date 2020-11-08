package com.zjxjwxk.leetcode._0121_Best_Time_to_Buy_and_Sell_Stock;

/**
 * @author Xinkang Wu
 * @date 2020/11/8 12:05 上午
 */
public class Solution {

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, maxProfit = 0;
        for (int price : prices) {
            min = Math.min(price, min);
            maxProfit = Math.max(price - min, maxProfit);
        }
        return maxProfit;
    }
}
