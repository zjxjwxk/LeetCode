package com.zjxjwxk.leetcode._0198_House_Robber;

/**
 * 动态规划1
 * @author Xinkang Wu
 * @date 2021/4/15 18:21
 */
public class Solution {

    public int rob(int[] nums) {
        int dp1 = 0, dp2 = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            int temp1 = Math.max(dp1, dp2);
            int temp2 = dp1 + nums[i];
            dp1 = temp1;
            dp2 = temp2;
        }
        return Math.max(dp1, dp2);
    }
}
