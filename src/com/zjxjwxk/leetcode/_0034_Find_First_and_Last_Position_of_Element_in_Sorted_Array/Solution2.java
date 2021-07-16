package com.zjxjwxk.leetcode._0034_Find_First_and_Last_Position_of_Element_in_Sorted_Array;

/**
 * 两次二分查找
 * @author Xinkang Wu
 * @date 2020/12/1 20:08
 */
public class Solution2 {

    public int[] searchRange(int[] nums, int target) {
        int left = binarySearch(nums, target, true);
        if (left == -2) {
            return new int[]{-1, -1};
        }
        int right = binarySearch(nums, target, false);
        if (right == -2) {
            return new int[]{-1, -1};
        }
        return new int[]{left + 1, right - 1};
    }

    private int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, mid;
        boolean findTarget = false;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                findTarget = true;
                if (lower) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        if (findTarget) {
            return lower ? right : left;
        }
        return -2;
    }
}
