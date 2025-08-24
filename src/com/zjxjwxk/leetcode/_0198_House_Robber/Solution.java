package com.zjxjwxk.leetcode._0198_House_Robber;

/**
 * 动态规划1
 * @author Xinkang Wu
 * @date 2021/4/15 18:21
 */
public class Solution {

    public int rob(int[] nums) {
        int dp1 = 0, dp2 = 0, dp3 = 0;
        for (int num : nums) {
            int max = Math.max(dp1, dp2) + num;
            dp1 = dp2;
            dp2 = dp3;
            dp3 = max;
        }
        return Math.max(dp2, dp3);
    }
}
