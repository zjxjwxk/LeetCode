package com.zjxjwxk.leetcode._1470_Shuffle_the_Array;

/**
 * 原地算法（位运算）
 *
 * @author Xinkang Wu
 * @date 2026/3/18 22:37
 */
public class Solution2 {

    public int[] shuffle(int[] nums, int n) {
        int mask = (1 << 10) - 1;
        for (int i = 0; i < (n << 1); ++i) {
            int j = i < n ? i << 1 : ((i - n) << 1) + 1;
            nums[j] |= (nums[i] & mask) << 10;
        }
        for (int i = 0; i < (n << 1); ++i) {
            nums[i] >>= 10;
        }
        return nums;
    }
}
