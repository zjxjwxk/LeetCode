package com.zjxjwxk.leetcode._0031_Next_Permutation;

/**
 * 二分+交换+翻转
 *
 * @author Xinkang Wu
 * @date 2025/9/13 13:29
 */
public class Solution2 {

    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            --i;
        }
        if (i >= 0) {
            int largerIndex = binarySearchLarger(nums, i + 1, nums.length - 1, nums[i]);
            swap(nums, i, largerIndex);
        }
        reverse(nums, i + 1, nums.length - 1);
    }

    private int binarySearchLarger(int[] nums, int left, int right, int target) {
        int mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (nums[mid] > target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
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
