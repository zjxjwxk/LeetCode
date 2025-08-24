package com.zjxjwxk.leetcode._0198_House_Robber;

/**
 * 动态规划2
 * @author Xinkang Wu
 * @date 2021/4/15 18:21
 */
public class Solution2 {

    public int rob(int[] nums) {
        int dp1 = 0, dp2 = 0;
        for (int num : nums) {
            int max = Math.max(dp1 + num, dp2);
            dp1 = dp2;
            dp2 = max;
        }
        return dp2;
    }
}
