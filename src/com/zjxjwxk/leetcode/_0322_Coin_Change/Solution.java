package com.zjxjwxk.leetcode._0322_Coin_Change;

import java.util.Arrays;

/**
 * 动态规划
 *
 * @author Xinkang Wu
 * @date 2025/8/27 23:40
 */
public class Solution {

    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] dp = new int[amount + 1];
        for (int curAmount = 1; curAmount <= amount; ++curAmount) {
            dp[curAmount] = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length && coins[j] <= curAmount; ++j) {
                int preNum = dp[curAmount - coins[j]];
                if (preNum != Integer.MAX_VALUE) {
                    dp[curAmount] = Math.min(dp[curAmount], preNum + 1);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}
