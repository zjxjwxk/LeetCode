package com.zjxjwxk.leetcode._0930_Binary_Subarrays_With_Sum;

/**
 * 滑动窗口
 * @author Xinkang Wu
 * @date 2021/7/8 19:51
 */
public class Solution2 {

    public int numSubarraysWithSum(int[] nums, int goal) {
        int left1 = 0, left2 = 0, right = 0, len = nums.length, sum1 = 0, sum2 = 0, ans = 0;
        while (right < len) {
            sum1 += nums[right];
            while (left1 <= right && sum1 > goal) {
                sum1 -= nums[left1];
                ++left1;
            }
            sum2 += nums[right];
            while (left2 <= right && sum2 >= goal) {
                sum2 -= nums[left2];
                ++left2;
            }
            ans += left2 - left1;
            ++right;
        }
        return ans;
    }
}
