package com.zjxjwxk.leetcode._0189_Rotate_Array;

/**
 * 数组翻转
 * @author Xinkang Wu
 * @date 2021/1/8 10:38
 */
public class Solution {

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if (len == 0) {
            return;
        }
        k %= len;
        reverse(nums, 0, len - k - 1);
        reverse(nums, len - k, len - 1);
        reverse(nums, 0, len - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        int i = left, j = right;
        while (i < j) {
            swap(nums, i++, j--);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
