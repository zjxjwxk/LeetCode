package com.zjxjwxk.leetcode._0274_H_Index;

import java.util.Arrays;

/**
 * 排序
 * @author Xinkang Wu
 * @date 2021/7/11 20:59
 */
public class Solution {

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int len = citations.length;
        return len - binarySearch(citations);
    }

    private int binarySearch(int[] citations) {
        int len = citations.length, left = 0, right = len - 1, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if ((len - mid) <= citations[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
