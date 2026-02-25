package com.zjxjwxk.leetcode._0918_Maximum_Sum_Circular_Subarray;

/**
 * 动态规划
 *
 * @author Xinkang Wu
 * @date 2026/2/25 16:59
 */
public class Solution {

    public int maxSubarraySumCircular(int[] nums) {
        int len = nums.length, sum = nums[0], preSum = nums[0], maxSum = nums[0];
        int[] leftMaxPreSum = new int[len];
        leftMaxPreSum[0] = nums[0];
        for (int i = 1; i < len; ++i) {
            int num = nums[i];
            sum = Math.max(sum + num, num);
            maxSum = Math.max(maxSum, sum);
            preSum += num;
            leftMaxPreSum[i] = Math.max(leftMaxPreSum[i - 1], preSum);
        }
        sum = 0;
        for (int i = len - 1; i > 0; --i) {
            sum += nums[i];
            maxSum = Math.max(maxSum, sum + leftMaxPreSum[i - 1]);
        }
        return maxSum;
    }
}
