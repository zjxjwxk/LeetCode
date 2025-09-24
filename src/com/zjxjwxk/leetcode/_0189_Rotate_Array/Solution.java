package com.zjxjwxk.leetcode._0189_Rotate_Array;

/**
 * 数组翻转
 * @author Xinkang Wu
 * @date 2021/1/8 10:38
 */
public class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1 - k);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left++, right--);
        }
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
