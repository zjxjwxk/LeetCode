package com.zjxjwxk.leetcode._0198_House_Robber;

/**
 * 动态规划2
 * @author Xinkang Wu
 * @date 2021/4/15 18:21
 */
public class Solution2 {

    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int first = nums[0], second = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; ++i) {
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }
        return second;
    }
}
