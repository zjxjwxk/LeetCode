package com.zjxjwxk.leetcode._0643_Maximum_Average_Subarray_I;

/**
 * 滑动窗口
 * @author Xinkang Wu
 * @date 2021/2/4 23:53
 */
public class Solution {

    public double findMaxAverage(int[] nums, int k) {
        int len = nums.length, sum = 0;
        for (int i = 0; i < k; ++i) {
            sum += nums[i];
        }
        int max = sum;
        for (int i = k; i < len; ++i) {
            sum -= nums[i - k];
            sum += nums[i];
            max = Math.max(max, sum);
        }
        return (double) max / k;
    }
}
