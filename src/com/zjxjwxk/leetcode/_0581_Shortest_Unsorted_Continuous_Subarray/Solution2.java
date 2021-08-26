package com.zjxjwxk.leetcode._0581_Shortest_Unsorted_Continuous_Subarray;

/**
 * 两次遍历
 * @author Xinkang Wu
 * @date 2021/8/25 17:29
 */
public class Solution2 {

    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length, left = -1, right = -1, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < len; ++i) {
            if (nums[i] >= max) {
                max = nums[i];
            } else {
                right = i;
            }
        }
        if (right == -1) {
            return 0;
        }
        for (int i = len - 1; i >= 0; --i) {
            if (nums[i] <= min) {
                min = nums[i];
            } else {
                left = i;
            }
        }
        return right - left + 1;
    }
}
