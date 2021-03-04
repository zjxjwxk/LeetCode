package com.zjxjwxk.leetcode._0338_Counting_Bits;

/**
 * 动态规划（最低设置位）
 * @author Xinkang Wu
 * @date 2021/3/4 12:46
 */
public class Solution4 {

    public int[] countBits(int num) {
        int[] counts = new int[num + 1];
        for (int i = 1; i <= num; ++i) {
            counts[i] = counts[i & (i - 1)] + 1;
        }
        return counts;
    }
}
