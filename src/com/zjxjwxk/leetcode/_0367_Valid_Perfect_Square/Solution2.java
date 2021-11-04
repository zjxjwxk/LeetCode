package com.zjxjwxk.leetcode._0367_Valid_Perfect_Square;

/**
 * 牛顿迭代法
 * @author Xinkang Wu
 * @date 2021/11/4 19:28
 */
public class Solution2 {

    public boolean isPerfectSquare(int num) {
        double x0 = num, x1 = (x0 + num / x0) / 2;
        while (x0 - x1 >= 1e-6) {
            x0 = x1;
            x1 = (x0 + num / x0) / 2;
        }
        int x = (int) x1;
        return x * x == num;
    }
}
