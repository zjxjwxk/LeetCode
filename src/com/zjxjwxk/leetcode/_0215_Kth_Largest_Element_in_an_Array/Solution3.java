package com.zjxjwxk.leetcode._0215_Kth_Largest_Element_in_an_Array;

/**
 * 基于快速排序的选择方法（优化版）
 * 尽量将pivot往中间靠，当前值等于pivot时仅执行一次++i或--j操作，
 * 避免一直执行++i或--j操作导致的左右区间不均匀，从而避免超时
 *
 * @author Xinkang Wu
 * @date 2021/5/19 17:35
 */
public class Solution3 {

    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    private int quickSelect(int[] nums, int left, int right, int k) {
        int i = left, j = right, pivot = nums[left];
        while (i < j) {
            while (i < j && nums[j] > pivot) {
                --j;
            }
            if (i < j) {
                nums[i++] = nums[j];
            }
            while (i < j && nums[i] < pivot) {
                ++i;
            }
            if (i < j) {
                nums[j--] = nums[i];
            }
        }
        nums[i] = pivot;
        if (i > k) {
            return quickSelect(nums, left, i - 1, k);
        } else if (i < k) {
            return quickSelect(nums, i + 1, right, k);
        } else {
            return nums[i];
        }
    }
}
