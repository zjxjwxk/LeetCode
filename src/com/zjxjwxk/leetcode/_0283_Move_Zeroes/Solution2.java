package com.zjxjwxk.leetcode._0283_Move_Zeroes;

/**
 * 双指针+交换
 *
 * @author Xinkang Wu
 * @date 2025/5/24 12:09
 */
public class Solution2 {

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int i = 0;
        for (int j = 0; j < nums.length; ++j) {
            if (nums[j] != 0) {
                swap(nums, i++, j);
            }
        }
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
