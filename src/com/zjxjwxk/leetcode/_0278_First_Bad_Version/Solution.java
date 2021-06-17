package com.zjxjwxk.leetcode._0278_First_Bad_Version;

/**
 * 二分查找
 * @author Xinkang Wu
 * @date 2021/6/17 23:02
 */
public class Solution {

    public int firstBadVersion(int n) {
        int left = 1, right = n, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (isBadVersion(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean isBadVersion(int version) {
        // 由题目给定
        return true;
    }
}
