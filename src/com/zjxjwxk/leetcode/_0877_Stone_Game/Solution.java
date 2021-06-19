package com.zjxjwxk.leetcode._0877_Stone_Game;

/**
 * @author Xinkang Wu
 * @date 2021/6/18 09:52
 */
public class Solution {

    public boolean stoneGame(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        for (int i = len - 1; i >= 0; --i) {
            dp[i] = nums[i];
            for (int j = i + 1; j < len; ++j) {
                dp[j] = Math.max(nums[i] - dp[j], nums[j] - dp[j - 1]);
            }
        }
        return dp[len - 1] > 0;
    }
}
