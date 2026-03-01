package com.zjxjwxk.leetcode._0215_Kth_Largest_Element_in_an_Array;

/**
 * 三路快速选择
 * 针对重复元素多的场景
 *
 * @author Xinkang Wu
 * @date 2026/3/1 15:56
 */
public class Solution4 {

    public int findKthLargest(int[] nums, int k) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int pivotIndex = (int) (left + ((right - left + 1) * Math.random()));
            int pivotVal = nums[pivotIndex];
            int lowerIndex = left, higherIndex = right, i = left;
            while (i <= higherIndex) {
                if (nums[i] > pivotVal) {
                    swap(nums, lowerIndex++, i++);
                } else if (nums[i] < pivotVal) {
                    swap(nums, higherIndex--, i);
                } else {
                    ++i;
                }
            }
            if (k - 1 < lowerIndex) {
                right = lowerIndex - 1;
            } else if (k - 1 > higherIndex) {
                left = higherIndex + 1;
            } else {
                return pivotVal;
            }
        }
        return -1;
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
