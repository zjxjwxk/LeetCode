package com.zjxjwxk.leetcode._0338_Counting_Bits;

/**
 * 直接计算
 * @author Xinkang Wu
 * @date 2021/3/4 12:46
 */
public class Solution {

    public int[] countBits(int num) {
        int[] counts = new int[num + 1];
        for (int i = 0; i <= num; ++i) {
            int temp = i;
            while (temp != 0) {
                temp &= (temp - 1);
                ++counts[i];
            }
        }
        return counts;
    }
}
