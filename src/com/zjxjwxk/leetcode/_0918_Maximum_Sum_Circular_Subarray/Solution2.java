package com.zjxjwxk.leetcode._0918_Maximum_Sum_Circular_Subarray;

/**
 * 取反
 *
 * @author Xinkang Wu
 * @date 2026/2/25 16:59
 */
public class Solution2 {

    public int maxSubarraySumCircular(int[] nums) {
        int len = nums.length, sum = nums[0];
        int preMax = nums[0], preMin = nums[0];
        int maxSum = nums[0], minSum = nums[0];
        for (int i = 1; i < len; ++i) {
            int num = nums[i];
            preMax = Math.max(preMax + num, num);
            preMin = Math.min(preMin + num, num);
            maxSum = Math.max(preMax, maxSum);
            minSum = Math.min(preMin, minSum);
            sum += num;
        }
        if (maxSum < 0) {
            return maxSum;
        }
        return Math.max(maxSum, sum - minSum);
    }
}
