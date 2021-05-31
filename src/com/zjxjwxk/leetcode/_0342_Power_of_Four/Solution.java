package com.zjxjwxk.leetcode._0342_Power_of_Four;

/**
 * 二进制表示中 1 的位置
 * @author Xinkang Wu
 * @date 2021/5/31 22:46
 */
public class Solution {

    public boolean isPowerOfFour(int n) {
        return n > 0 && ((n & (n - 1)) == 0) && ((n & 0xaaaaaaaa) == 0);
    }
}
