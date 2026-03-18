package com.zjxjwxk.leetcode._1470_Shuffle_the_Array;

/**
 * 额外数组
 *
 * @author Xinkang Wu
 * @date 2026/3/18 22:37
 */
public class Solution {

    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n << 1];
        for (int i = 0; i < n; ++i) {
            ans[i << 1] = nums[i];
            ans[(i << 1) + 1] = nums[i + n];
        }
        return ans;
    }
}
