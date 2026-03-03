package com.zjxjwxk.leetcode._0190_Reverse_Bits;

/**
 * 位运算
 *
 * @author Xinkang Wu
 * @date 2026/3/3 18:29
 */
public class Solution2 {

    public int reverseBits(int n) {
        int base1 = 1, base2 = 1 << 31, ans = 0;
        for (int i = 0; i < 32; ++i) {
            int digit = n & base1;
            if (digit > 0) {
                ans ^= base2;
            }
            base1 <<= 1;
            base2 >>>= 1;
        }
        return ans;
    }
}
