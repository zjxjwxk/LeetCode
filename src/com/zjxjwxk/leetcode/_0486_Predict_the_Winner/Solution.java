package com.zjxjwxk.leetcode._0486_Predict_the_Winner;

/**
 * 递归
 * 时间复杂度: (2^n)
 * @author Xinkang Wu
 * @date 2021/6/19 14:19
 */
public class Solution {

    public boolean PredictTheWinner(int[] nums) {
        return dfs(nums, 0, nums.length - 1, 1) >= 0;
    }

    private int dfs(int[] nums, int left, int right, int player) {
        if (left == right) {
            return player * nums[left];
        }
        return player * Math.max(
                player * (player * nums[left] + dfs(nums, left + 1, right, -player)),
                player * (player * nums[right] + dfs(nums, left, right - 1, -player))
        );
    }
}
