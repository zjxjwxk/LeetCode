package com.zjxjwxk.leetcode._0581_Shortest_Unsorted_Continuous_Subarray;

import java.util.Arrays;

/**
 * 排序
 * @author Xinkang Wu
 * @date 2021/8/25 17:29
 */
public class Solution {

    public int findUnsortedSubarray(int[] nums) {
        if (isSorted(nums)) {
            return 0;
        }
        int len = nums.length;
        int[] copy = new int[len];
        System.arraycopy(nums, 0, copy, 0, len);
        Arrays.sort(copy);
        int i = 0, j = len - 1;
        while (i < len && copy[i] == nums[i]) {
            ++i;
        }
        while (j >= i && copy[j] == nums[j]) {
            --j;
        }
        return j - i + 1;
    }

    private boolean isSorted(int[] nums) {
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
