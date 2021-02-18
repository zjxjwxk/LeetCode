package com.zjxjwxk.leetcode._0995_Minimum_Number_of_K_Consecutive_Bit_Flips;

/**
 * 暴力
 * 时间：O(NK)，空间：O(1)
 * @author Xinkang Wu
 * @date 2021/2/18 15:57
 */
public class Solution {

    public int minKBitFlips(int[] A, int K) {
        int len = A.length, count = 0;
        for (int i = 0; i < len; ++i) {
            if (A[i] == 0) {
                if (i > len - K) {
                    return -1;
                }
                for (int j = i; j < i + K; ++j) {
                    A[j] ^= 1;
                }
                ++count;
            }
        }
        return count;
    }
}
