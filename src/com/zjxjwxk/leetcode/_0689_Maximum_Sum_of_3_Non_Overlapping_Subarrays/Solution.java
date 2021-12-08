package com.zjxjwxk.leetcode._0689_Maximum_Sum_of_3_Non_Overlapping_Subarrays;

/**
 * 滑动窗口
 * @author Xinkang Wu
 * @date 2021/12/8 14:49
 */
public class Solution {

    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int len = nums.length, sum1 = 0, sum2 = 0, sum3 = 0, maxSum1 = 0, maxSum12 = 0, maxSum123 = 0, maxSum1Index = 0;
        int[] maxSum12Indexes = new int[2];
        int[] maxSum123Indexes = new int[3];
        for (int i = (k << 1); i < len; ++i) {
            sum1 += nums[i - (k << 1)];
            sum2 += nums[i - k];
            sum3 += nums[i];
            if (i >= 3 * k - 1) {
                if (sum1 > maxSum1) {
                    maxSum1 = sum1;
                    maxSum1Index = i - 3 * k + 1;
                }
                if (sum2 + maxSum1 > maxSum12) {
                    maxSum12 = sum2 + maxSum1;
                    maxSum12Indexes[0] = maxSum1Index;
                    maxSum12Indexes[1] = i - (k << 1) + 1;
                }
                if (sum3 + maxSum12 > maxSum123) {
                    maxSum123 = sum3 + maxSum12;
                    maxSum123Indexes[0] = maxSum12Indexes[0];
                    maxSum123Indexes[1] = maxSum12Indexes[1];
                    maxSum123Indexes[2] = i - k + 1;
                }
                sum1 -= nums[i - 3 * k + 1];
                sum2 -= nums[i - (k << 1) + 1];
                sum3 -= nums[i - k + 1];
            }
        }
        return maxSum123Indexes;
    }
}
