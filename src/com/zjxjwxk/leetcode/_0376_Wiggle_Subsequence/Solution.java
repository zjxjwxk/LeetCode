package com.zjxjwxk.leetcode._0376_Wiggle_Subsequence;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2020/12/12 23:42
 */
public class Solution {

    public int wiggleMaxLength(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int up = 1, down = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > nums[i - 1]) {
                up = Math.max(down + 1, up);
            } else if (nums[i] < nums[i - 1]) {
                down = Math.max(up + 1, down);
            }
        }
        return Math.max(up, down);
    }
}
