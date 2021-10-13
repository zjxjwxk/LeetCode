package com.zjxjwxk.leetcode._0050_Pow;

/**
 * 快速幂+迭代
 * @author Xinkang Wu
 * @date 2020/8/31 1:13 上午
 */
public class Solution {

    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        long b = n;
        double result = 1.0;
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }
        while (b != 0) {
            if ((b & 1) == 1) {
                result *= x;
            }
            x *= x;
            b >>= 1;
        }
        return result;
    }
}
