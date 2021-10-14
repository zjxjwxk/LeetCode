package com.zjxjwxk.leetcode._0029_Divide_Two_Integers;

/**
 * 快速乘+二分查找
 * @author Xinkang Wu
 * @date 2021/10/12 21:34
 */
public class Solution2 {

    public int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }
        if (divisor == 1) {
            return dividend;
        }
        if (divisor == -1) {
            if (dividend == Integer.MIN_VALUE) {
                return Integer.MAX_VALUE;
            }
            return -dividend;
        }
        if (divisor == Integer.MIN_VALUE) {
            if (dividend == Integer.MIN_VALUE) {
                return 1;
            }
            return 0;
        }
        if (dividend > 0) {
            dividend = -dividend;
            divisor = -divisor;
        }
        int sign = 1;
        if (divisor > 0) {
            divisor = -divisor;
            sign = -1;
        }
        int left = 0, right = Integer.MAX_VALUE, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (quickAdd(divisor, mid, dividend)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return sign * right;
    }

    private boolean quickAdd(int y, int z, int x) {
        int sum = 0;
        while (z != 0) {
            if ((z & 1) == 1) {
                if (sum < x - y) {
                    return false;
                }
                sum += y;
            }
            y <<= 1;
            z >>= 1;
        }
        return true;
    }
}
