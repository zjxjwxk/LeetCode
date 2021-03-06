package com.zjxjwxk.leetcode._0486_Predict_the_Winner;

/**
 * 动态规划
 * 时间复杂度: (n^2)
 * @author Xinkang Wu
 * @date 2021/6/19 14:19
 */
public class Solution2 {

    public boolean PredictTheWinner(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        for (int i = len - 1; i >= 0; --i) {
            dp[i] = nums[i];
            for (int j = i + 1; j < len; ++j) {
                dp[j] = Math.max(nums[i] - dp[j], nums[j] - dp[j - 1]);
            }
        }
        return dp[len - 1] >= 0;
    }
}
