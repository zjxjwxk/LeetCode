package com.zjxjwxk.leetcode._0493_Reverse_Pairs;

/**
 * 归并排序
 * @author Xinkang Wu
 * @date 2020/11/28 21:13
 */
public class Solution {

    public int reversePairs(int[] nums) {
        return mergeSortAndCount(nums, 0, nums.length - 1);
    }

    private int mergeSortAndCount(int[] nums, int left, int right) {
        if (left >= right) {
            return 0;
        }
        int mid = left + ((right - left) >> 1);
        int count = mergeSortAndCount(nums, left, mid) + mergeSortAndCount(nums, mid + 1, right);
        int i = left, j = mid + 1;
        while (j <= right) {
            while (i <= mid && (long) nums[i] <= 2 * (long) nums[j]) {
                ++i;
            }
            count += (mid - i + 1);
            ++j;
        }
        i = left;
        j = mid + 1;
        int index = 0, tempLen = right - left + 1;
        int[] temp = new int[tempLen];
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[index++] = nums[i++];
            } else {
                temp[index++] = nums[j++];
            }
        }
        while (i <= mid) {
            temp[index++] = nums[i++];
        }
        while (j <= right) {
            temp[index++] = nums[j++];
        }
        System.arraycopy(temp, 0, nums, left, tempLen);
        return count;
    }
}
