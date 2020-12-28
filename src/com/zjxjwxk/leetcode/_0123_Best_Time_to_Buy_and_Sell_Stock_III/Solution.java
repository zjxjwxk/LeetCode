package com.zjxjwxk.leetcode._0123_Best_Time_to_Buy_and_Sell_Stock_III;

/**
 * 两次遍历
 * @author Xinkang Wu
 * @date 2020/12/28 11:13
 */
public class Solution {

    public int maxProfit(int[] prices) {
        int len = prices.length, min = Integer.MAX_VALUE, maxProfit = 0, ans = 0;
        int[] leftMaxProfit = new int[len];
        int[] rightMaxProfit = new int[len];
        for (int i = 0; i < len; ++i) {
            min = Math.min(min, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - min);
            leftMaxProfit[i] = maxProfit;
        }
        int max = Integer.MIN_VALUE;
        maxProfit = 0;
        for (int i = len - 1; i >= 0; --i) {
            max = Math.max(max, prices[i]);
            maxProfit = Math.max(maxProfit, max - prices[i]);
            rightMaxProfit[i] = maxProfit;
        }
        for (int i = 0; i < len; ++i) {
            ans = Math.max(ans, leftMaxProfit[i] + rightMaxProfit[i]);
        }
        return ans;
    }
}
