package com.zjxjwxk.leetcode._0209_Minimum_Size_Subarray_Sum;

/**
 * 滑动窗口
 *
 * @author Xinkang Wu
 * @date 2022/8/26 21:01
 */
public class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length, i = 0, j = 0, sum = 0, ans = Integer.MAX_VALUE;
        while (j < len) {
            sum += nums[j++];
            while (sum >= target) {
                ans = Math.min(ans, j - i);
                sum -= nums[i++];
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
