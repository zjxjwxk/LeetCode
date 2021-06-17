package com.zjxjwxk.leetcode._0852_Peak_Index_in_a_Mountain_Array;

/**
 * 二分查找
 * @author Xinkang Wu
 * @date 2021/6/17 23:27
 */
public class Solution {

    public int peakIndexInMountainArray(int[] arr) {
        int left = 1, right = arr.length - 2, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else if (arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
