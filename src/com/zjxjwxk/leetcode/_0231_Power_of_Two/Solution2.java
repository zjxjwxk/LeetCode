package com.zjxjwxk.leetcode._0231_Power_of_Two;

/**
 * 二进制表示
 * 技巧二：n & (-n)
 * 获取 n 二进制表示的最低位的 1
 * @author Xinkang Wu
 * @date 2021/5/30 11:25
 */
public class Solution2 {

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (-n)) == n;
    }
}
