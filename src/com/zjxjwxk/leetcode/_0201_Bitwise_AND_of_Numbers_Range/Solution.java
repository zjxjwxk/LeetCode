package com.zjxjwxk.leetcode._0201_Bitwise_AND_of_Numbers_Range;

/**
 * 位运算
 *
 * @author Xinkang Wu
 * @date 2026/3/5 17:57
 */
public class Solution {

    public int rangeBitwiseAnd(int left, int right) {
        int shift = 0;
        while (left != right) {
            left >>= 1;
            right >>= 1;
            ++shift;
        }
        return left << shift;
    }
}
