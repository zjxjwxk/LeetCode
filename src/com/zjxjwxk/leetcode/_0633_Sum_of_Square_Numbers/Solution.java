package com.zjxjwxk.leetcode._0633_Sum_of_Square_Numbers;

/**
 * 使用sqrt函数
 * @author Xinkang Wu
 * @date 2021/4/28 21:20
 */
public class Solution {

    public boolean judgeSquareSum(int c) {
        for (int a = 0; a <= Math.sqrt(c); ++a) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b) {
                return true;
            }
        }
        return false;
    }
}
