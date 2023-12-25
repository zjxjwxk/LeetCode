package com.zjxjwxk.leetcode._0033_Search_in_Rotated_Sorted_Array;

/**
 * 二分查找
 * @author Xinkang Wu
 * @date 2023/12/25 20:03
 */
public class Solution2 {

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (nums[mid] < target) {
                if (nums[right] >= target || nums[right] < nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else if (nums[mid] > target) {
                if (nums[right] > nums[mid] || nums[right] < target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                return mid;
            }
        }
        return -1;
    }
}
