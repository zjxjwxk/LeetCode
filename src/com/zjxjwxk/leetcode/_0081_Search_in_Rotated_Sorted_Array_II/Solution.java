package com.zjxjwxk.leetcode._0081_Search_in_Rotated_Sorted_Array_II;

/**
 * 二分查找
 * @author Xinkang Wu
 * @date 2021/4/8 19:26
 */
public class Solution {

    public boolean search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return true;
            } else {
                if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                    ++left;
                    --right;
                } else if (nums[left] <= nums[mid]) {
                    if (target >= nums[left] && target < nums[mid]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else {
                    if (target > nums[mid] && target <= nums[right]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
        }
        return false;
    }
}
