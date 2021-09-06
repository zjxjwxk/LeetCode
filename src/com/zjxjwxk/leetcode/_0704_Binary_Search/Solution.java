package com.zjxjwxk.leetcode._0704_Binary_Search;

/**
 * 二分查找
 * @author Xinkang Wu
 * @date 2021/9/6 20:44
 */
public class Solution {

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
