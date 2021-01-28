package com.zjxjwxk.leetcode._0724_Find_Pivot_Index;

/**
 * 前缀和
 * @author Xinkang Wu
 * @date 2021/1/28 23:09
 */
public class Solution {

    public int pivotIndex(int[] nums) {
        int len = nums.length, totalSum = 0, sum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        for (int i = 0; i < len; ++i) {
            if ((sum << 1) + nums[i] == totalSum) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}
