package com.zjxjwxk.leetcode._0461_Hamming_Distance;

/**
 * Brian Kernighan 算法
 * @author Xinkang Wu
 * @date 2021/5/27 20:08
 */
public class Solution3 {

    public int hammingDistance(int x, int y) {
        int s = x ^ y, count = 0;
        while (s != 0) {
            ++count;
            s = s & (s - 1);
        }
        return count;
    }
}
