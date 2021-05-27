package com.zjxjwxk.leetcode._0461_Hamming_Distance;

/**
 * 移位实现位计数
 * @author Xinkang Wu
 * @date 2021/5/27 20:08
 */
public class Solution2 {

    public int hammingDistance(int x, int y) {
        int s = x ^ y;
        int count = 0;
        while (s != 0) {
            count += (s & 1);
            s >>= 1;
        }
        return count;
    }
}
