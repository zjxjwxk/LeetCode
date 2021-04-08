package com.zjxjwxk.leetcode._0153_Find_Minimum_in_Rotated_Sorted_Array;

/**
 * @author Xinkang Wu
 * @date 2021/4/8 21:01
 */
public class Solution {

    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1, mid;
        while (left < right) {
            mid = left + ((right - left) >> 1);
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
}
