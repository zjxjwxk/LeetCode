package com.zjxjwxk.leetcode._0050_Pow;

/**
 * 快速幂+递归
 * @author Xinkang Wu
 * @date 2020/8/31 1:13 上午
 */
public class Solution2 {

    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        long longN = n;
        if (n < 0) {
            x = 1 / x;
            longN = -longN;
        }
        return quickMul(x, longN);
    }

    private double quickMul(double x, long longN) {
        if (longN == 0) {
            return 1;
        }
        double y = quickMul(x, longN >> 1);
        return (longN & 1) == 1 ? y * y * x : y * y;
    }
}
