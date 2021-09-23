package com.zjxjwxk.leetcode._0326_Power_of_Three;

/**
 * 试除法
 * @author Xinkang Wu
 * @date 2021/9/23 10:03
 */
public class Solution {

    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
