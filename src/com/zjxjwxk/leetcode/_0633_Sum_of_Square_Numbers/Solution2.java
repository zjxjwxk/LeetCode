package com.zjxjwxk.leetcode._0633_Sum_of_Square_Numbers;

/**
 * 使用双指针
 * @author Xinkang Wu
 * @date 2021/4/28 21:20
 */
public class Solution2 {

    public boolean judgeSquareSum(int c) {
        long left = 0, right = (long) Math.sqrt(c);
        while (left <= right) {
            long sum = left * left + right * right;
            if (sum > c) {
                --right;
            } else if (sum < c) {
                ++left;
            } else {
                return true;
            }
        }
        return false;
    }
}
