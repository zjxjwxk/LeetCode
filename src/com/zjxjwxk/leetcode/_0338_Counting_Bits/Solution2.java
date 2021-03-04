package com.zjxjwxk.leetcode._0338_Counting_Bits;

/**
 * 动态规划（最高有效位）
 * @author Xinkang Wu
 * @date 2021/3/4 12:46
 */
public class Solution2 {

    public int[] countBits(int num) {
        int[] counts = new int[num + 1];
        int high = 0;
        for (int i = 1; i <= num; ++i) {
            if ((i & (i - 1)) == 0) {
                high = i;
            }
            counts[i] = counts[i - high] + 1;
        }
        return counts;
    }
}
