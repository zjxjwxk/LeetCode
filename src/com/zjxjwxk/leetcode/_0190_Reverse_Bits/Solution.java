package com.zjxjwxk.leetcode._0190_Reverse_Bits;

/**
 * 位运算
 * @author Xinkang Wu
 * @date 2021/3/29 09:59
 */
public class Solution {

    public int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; ++i) {
            ans <<= 1;
            ans += (n & 1);
            n >>>= 1;
        }
        return ans;
    }
}
