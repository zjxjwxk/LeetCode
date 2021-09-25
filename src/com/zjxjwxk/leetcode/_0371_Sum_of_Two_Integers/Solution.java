package com.zjxjwxk.leetcode._0371_Sum_of_Two_Integers;

/**
 * 位运算
 * @author Xinkang Wu
 * @date 2021/9/26 01:12
 */
public class Solution {

    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;
            a ^= b;
            b = carry;
        }
        return a;
    }
}
