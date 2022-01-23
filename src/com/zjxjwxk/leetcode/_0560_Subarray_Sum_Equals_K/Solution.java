package com.zjxjwxk.leetcode._0560_Subarray_Sum_Equals_K;

/**
 * 暴力枚举
 * @author Xinkang Wu
 * @date 2022/1/23 11:14
 */
public class Solution {

    public int subarraySum(int[] nums, int k) {
        int len = nums.length, ans = 0;
        for (int i = 0; i < len; ++i) {
            int sum = 0;
            for (int j = i; j < len; ++j) {
                sum += nums[j];
                if (sum == k) {
                    ++ans;
                }
            }
        }
        return ans;
    }
}
