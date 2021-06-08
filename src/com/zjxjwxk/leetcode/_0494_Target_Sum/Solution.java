package com.zjxjwxk.leetcode._0494_Target_Sum;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2021/6/7 23:51
 */
public class Solution {

    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0, neg;
        for (int num : nums) {
            sum += num;
        }
        if (sum < target || ((sum - target) & 1) == 1) {
            return 0;
        }
        neg = ((sum - target) >> 1);
        int[] dp = new int[neg + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int j = neg; j >= num; --j) {
                dp[j] = dp[j] + dp[j - num];
            }
        }
        return dp[neg];
    }
}
