package com.zjxjwxk.leetcode._0376_Wiggle_Subsequence;

/**
 * 贪心
 * @author Xinkang Wu
 * @date 2020/12/13 20:55
 */
public class Solution2 {

    public int wiggleMaxLength(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int trend = -1, ans = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] < nums[i - 1] && (trend == 1 || trend == -1)) {
                ++ans;
                trend = 0;
            } else if (nums[i] > nums[i - 1] && (trend == 0 || trend == -1)) {
                ++ans;
                trend = 1;
            }
        }
        return ans;
    }
}
