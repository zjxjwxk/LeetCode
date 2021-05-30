package com.zjxjwxk.leetcode._0231_Power_of_Two;

/**
 * 判断是否为最大 2 的幂的约数
 * @author Xinkang Wu
 * @date 2021/5/30 11:25
 */
public class Solution3 {

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (1 << 30) % n == 0;
    }
}
