package com.zjxjwxk.leetcode._0164_Maximum_Gap;

/**
 * 基数排序
 * @author Xinkang Wu
 * @date 2020/11/26 09:53
 */
public class Solution {

    public int maximumGap(int[] nums) {
        int len = nums.length, exp = 1, max = Integer.MIN_VALUE, ans = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        while (exp <= max) {
            int[] counts = new int[10], buf = new int[len];
            for (int num : nums) {
                int digit = (num / exp) % 10;
                ++counts[digit];
            }
            for (int i = 1; i < counts.length; ++i) {
                counts[i] += counts[i - 1];
            }
            for (int i = len - 1; i >= 0; --i) {
                int digit = (nums[i] / exp) % 10;
                buf[counts[digit] - 1] = nums[i];
                --counts[digit];
            }
            nums = buf;
            exp *= 10;
        }
        for (int i = 1; i < len; ++i) {
            ans = Math.max(ans, nums[i] - nums[i - 1]);
        }
        return ans;
    }
}
