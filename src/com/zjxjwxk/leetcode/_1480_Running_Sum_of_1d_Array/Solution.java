package com.zjxjwxk.leetcode._1480_Running_Sum_of_1d_Array;

/**
 * 原地修改
 * @author Xinkang Wu
 * @date 2021/9/17 15:55
 */
public class Solution {

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; ++i) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }
}
