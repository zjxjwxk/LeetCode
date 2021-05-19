package com.zjxjwxk.leetcode._0215_Kth_Largest_Element_in_an_Array;

import java.util.Random;

/**
 * 基于快速排序的选择方法
 * @author Xinkang Wu
 * @date 2021/5/19 17:35
 */
public class Solution2 {

    private Random random;

    public int findKthLargest(int[] nums, int k) {
        this.random = new Random();
        return quickSelect(nums, 0, nums.length - 1, k);
    }

    private int quickSelect(int[] nums, int left, int right, int k) {
        int pivot = partition(nums, left, right);
        if (pivot == k - 1) {
            return nums[pivot];
        }
        if (pivot < k - 1) {
            return quickSelect(nums, pivot + 1, right, k);
        } else {
            return quickSelect(nums, left, pivot - 1, k);
        }
    }

    private int partition(int[] nums, int left, int right) {
        int pivotIndex = left + random.nextInt(right - left + 1);
        swap(nums, right, pivotIndex);
        int pivotValue = nums[right], i = left;
        for (int j = left; j < right; ++j) {
            if (nums[j] > pivotValue) {
                swap(nums, i++, j);
            }
        }
        swap(nums, i, right);
        return i;
    }

    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
