package com.zjxjwxk.leetcode._0338_Counting_Bits;

/**
 * 动态规划（最低有效位）
 * @author Xinkang Wu
 * @date 2021/3/4 12:46
 */
public class Solution3 {

    public int[] countBits(int num) {
        int[] counts = new int[num + 1];
        for (int i = 1; i <= num; ++i) {
            counts[i] = counts[i >> 1] + (i & 1);
        }
        return counts;
    }
}
