package com.zjxjwxk.leetcode._1009_Complement_of_Base_10_Integer;

/**
 * 位运算
 * @author Xinkang Wu
 * @date 2021/10/18 22:25
 */
public class Solution {

    public int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }
        int i = 1 << 30;
        while ((n & i) == 0) {
            i >>= 1;
        }
        return n ^ ((i << 1) - 1);
    }
}
