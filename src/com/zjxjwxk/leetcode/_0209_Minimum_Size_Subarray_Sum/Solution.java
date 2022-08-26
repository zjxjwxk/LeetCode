package com.zjxjwxk.leetcode._0209_Minimum_Size_Subarray_Sum;

/**
 * 滑动窗口
 *
 * @author Xinkang Wu
 * @date 2022/8/26 21:01
 */
public class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0, j = 0, len = nums.length, sum = 0, minLen = Integer.MAX_VALUE;
        while (j < len) {
            while (j < len && sum < target) {
                sum += nums[j++];
            }
            while (i < j && sum >= target) {
                minLen = Math.min(minLen, j - i);
                sum -= nums[i++];
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
