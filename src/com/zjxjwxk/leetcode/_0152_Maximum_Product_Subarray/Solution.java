package com.zjxjwxk.leetcode._0152_Maximum_Product_Subarray;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2022/2/16 22:20
 */
public class Solution {

    public int maxProduct(int[] nums) {
        int len = nums.length, max = nums[0], min = nums[0], ans = nums[0];
        for (int i = 1; i < len; ++i) {
            int preMax = max, preMin = min;
            max = Math.max(nums[i], Math.max(nums[i] * preMax, nums[i] * preMin));
            min = Math.min(nums[i], Math.min(nums[i] * preMax, nums[i] * preMin));
            ans = Math.max(ans, max);
        }
        return ans;
    }
}
