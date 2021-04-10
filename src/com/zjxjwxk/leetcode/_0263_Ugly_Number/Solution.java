package com.zjxjwxk.leetcode._0263_Ugly_Number;

/**
 * 数学
 * @author Xinkang Wu
 * @date 2021/4/10 21:18
 */
public class Solution {

    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        int[] factors = {2, 3, 5};
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }
}
