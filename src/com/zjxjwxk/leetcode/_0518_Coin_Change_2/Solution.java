package com.zjxjwxk.leetcode._0518_Coin_Change_2;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2021/6/14 22:21
 */
public class Solution {

    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int j = coin; j <= amount; ++j) {
                dp[j] += dp[j - coin];
            }
        }
        return dp[amount];
    }
}
