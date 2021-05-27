package com.zjxjwxk.leetcode._0461_Hamming_Distance;

/**
 * 内置位计数功能
 * @author Xinkang Wu
 * @date 2021/5/27 20:08
 */
public class Solution {

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
