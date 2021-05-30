package com.zjxjwxk.leetcode._0231_Power_of_Two;

/**
 * 二进制表示
 * 技巧一：n & (n - 1)
 * 将 n 二进制表示的最低位 1 移除
 * @author Xinkang Wu
 * @date 2021/5/30 11:25
 */
public class Solution {

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
