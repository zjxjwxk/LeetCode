package com.zjxjwxk.leetcode._0995_Minimum_Number_of_K_Consecutive_Bit_Flips;

/**
 * 滑动窗口
 * （模2意义下的加减法与异或等价）
 * 时间：O(N)，空间：O(1)
 * @author Xinkang Wu
 * @date 2021/2/18 15:57
 */
public class Solution3 {

    public int minKBitFlips(int[] A, int K) {
        int len = A.length, ans = 0, count = 0;
        for (int i = 0; i < len; ++i) {
            if (i >= K && A[i - K] > 1) {
                count ^= 1;
            }
            if (A[i] == count) {
                if (i > len - K) {
                    return -1;
                }
                count ^= 1;
                A[i] += 2;
                ++ans;
            }
        }
        return ans;
    }
}
