package com.zjxjwxk.leetcode._0367_Valid_Perfect_Square;

/**
 * 二分查找
 * @author Xinkang Wu
 * @date 2021/11/4 19:28
 */
public class Solution {

    public boolean isPerfectSquare(int num) {
        int left = 1, right = num, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            long product = (long) mid * mid;
            if (product > num) {
                right = mid - 1;
            } else if (product < num) {
                left = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
