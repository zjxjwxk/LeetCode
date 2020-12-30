package com.zjxjwxk.leetcode._0330_Patching_Array;

/**
 * 贪心
 * @author Xinkang Wu
 * @date 2020/12/29 21:51
 */
public class Solution {

    public int minPatches(int[] nums, int n) {
        int len = nums.length, index = 0, ans = 0, x = 0;
        while (x < n && x >= 0) {
            if (index < len && nums[index] <= x + 1) {
                x += nums[index++];
            } else {
                ++ans;
                x = x * 2 + 1;
            }
        }
        return ans;
    }
}
