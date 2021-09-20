package com.zjxjwxk.leetcode._0673_Number_of_Longest_Increasing_Subsequence;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2021/9/20 14:55
 */
public class Solution {

    public int findNumberOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length, maxLen = 1, ans = 0;
        int[] dp = new int[n];
        int[] counts = new int[n];
        for (int i = 0; i < n; ++i) {
            dp[i] = 1;
            counts[i] = 1;
            for (int j = 0; j < i; ++j) {
                if (nums[i] > nums[j]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        counts[i] = counts[j];
                    } else if (dp[j] + 1 == dp[i]) {
                        counts[i] += counts[j];
                    }
                }
            }
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                ans = counts[i];
            } else if (dp[i] == maxLen) {
                ans += counts[i];
            }
        }
        return ans;
    }
}
