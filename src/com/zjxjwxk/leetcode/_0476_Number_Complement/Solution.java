package com.zjxjwxk.leetcode._0476_Number_Complement;

/**
 * 位运算
 * @author Xinkang Wu
 * @date 2021/10/18 13:47
 */
public class Solution {

    public int findComplement(int num) {
        int i = 1 << 30;
        while ((num & i) == 0) {
            i >>= 1;
        }
        return num ^ ((i << 1) - 1);
    }
}
