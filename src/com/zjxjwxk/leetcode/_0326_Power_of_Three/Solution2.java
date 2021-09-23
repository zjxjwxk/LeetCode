package com.zjxjwxk.leetcode._0326_Power_of_Three;

/**
 * 判断是否为最大 33 的幂的约数
 * @author Xinkang Wu
 * @date 2021/9/23 10:03
 */
public class Solution2 {

    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}
