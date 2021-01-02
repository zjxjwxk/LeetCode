package com.zjxjwxk.leetcode._0239_Sliding_Window_Maximum;

/**
 * 分块+预处理
 * @author Xinkang Wu
 * @date 2021/1/2 21:10
 */
public class Solution3 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int[] prefixMax = new int[len];
        int[] suffixMax = new int[len];
        int[] ans = new int[len - k + 1];
        for (int i = 0; i < len; ++i) {
            if (i % k == 0) {
                prefixMax[i] = nums[i];
            } else {
                prefixMax[i] = Math.max(prefixMax[i - 1], nums[i]);
            }
        }
        suffixMax[len - 1] = nums[len - 1];
        for (int i = len - 2; i >= 0; --i) {
            if ((i + 1) % k == 0) {
                suffixMax[i] = nums[i];
            } else {
                suffixMax[i] = Math.max(suffixMax[i + 1], nums[i]);
            }
        }
        for (int i = 0; i <= len - k; ++i) {
            ans[i] = Math.max(suffixMax[i], prefixMax[i + k - 1]);
        }
        return ans;
    }
}
