package com.zjxjwxk.leetcode._0029_Divide_Two_Integers;

/**
 * 暴力迭代
 * @author Xinkang Wu
 * @date 2021/10/12 21:34
 */
public class Solution {

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
        int count = 0;
        if (dividend > 0 && divisor > 0) {
            while (dividend >= divisor) {
                dividend -= divisor;
                ++count;
            }
            return count;
        } else if (dividend < 0 && divisor < 0) {
            while (dividend <= divisor) {
                dividend -= divisor;
                ++count;
            }
            return count;
        } else {
            if (dividend < 0) {
                while (dividend <= -divisor) {
                    dividend += divisor;
                    ++count;
                }
            } else {
                while (dividend >= -divisor) {
                    dividend += divisor;
                    ++count;
                }
            }
            return -count;
        }
    }
}
