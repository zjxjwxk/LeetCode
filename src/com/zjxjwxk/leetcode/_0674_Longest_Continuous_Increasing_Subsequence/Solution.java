package com.zjxjwxk.leetcode._0674_Longest_Continuous_Increasing_Subsequence;

/**
 * 贪心
 * @author Xinkang Wu
 * @date 2021/1/24 11:30
 */
public class Solution {

    public int findLengthOfLCIS(int[] nums) {
        int left = 0, len = nums.length, ans = 0;
        for (int i = 1; i < len; ++i) {
            if (nums[i] <= nums[i - 1]) {
                ans = Math.max(ans, i - left);
                left = i;
            }
        }
        ans = Math.max(ans, len - left);
        return ans;
    }
}
