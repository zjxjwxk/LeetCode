package com.zjxjwxk.leetcode._0746_Min_Cost_Climbing_Stairs;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2020/12/21 19:31
 */
public class Solution {

    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] dp = new int[len + 1];
        dp[0] = dp[1] = 0;
        for (int i = 2; i <= len; ++i) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[len];
    }
}
