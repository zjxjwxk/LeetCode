package com.zjxjwxk.leetcode._0213_House_Robber_II;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2021/4/15 19:43
 */
public class Solution {

    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        return Math.max(rob(nums, 0, len - 2), rob(nums, 1, len - 1));
    }

    private int rob(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }
        int first = nums[left], second = Math.max(nums[left], nums[left + 1]);
        for (int i = left + 2; i <= right; ++i) {
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }
        return second;
    }
}
