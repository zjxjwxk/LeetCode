package com.zjxjwxk.leetcode._0377_Combination_Sum_IV;

/**
 * 动态规划
 *
 * @author Xinkang Wu
 * @date 2021/5/15 15:42
 */
public class Solution {

    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; ++i) {
            for (int num : nums) {
                if (i >= num) {
                    dp[i] += dp[i - num];
                }
            }
        }
        return dp[target];
    }
}
