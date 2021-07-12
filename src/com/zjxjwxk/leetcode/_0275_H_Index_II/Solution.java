package com.zjxjwxk.leetcode._0275_H_Index_II;

/**
 * 二分查找
 * @author Xinkang Wu
 * @date 2021/7/12 21:07
 */
public class Solution {

    public int hIndex(int[] citations) {
        int len = citations.length, left = 0, right = len - 1, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if ((len - mid) <= citations[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return len - left;
    }
}
