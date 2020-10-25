package com.zjxjwxk.leetcode._0845_Longest_Mountain_in_Array;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2020/10/25 10:08 上午
 */
public class Solution2 {

    public int longestMountain(int[] A) {
        int len = A.length, ans = 0;
        int[] left = new int[len], right = new int[len];
        for (int i = 1; i < len; ++i) {
            left[i] = A[i] > A[i - 1] ? left[i - 1] + 1 : 0;
        }
        for (int i = len - 2; i >= 0; --i) {
            right[i] = A[i] > A[i + 1] ? right[i + 1] + 1 : 0;
        }
        for (int i = 0; i < len; ++i) {
            if (left[i] > 0 && right[i] > 0) {
                ans = Math.max(ans, left[i] + 1 + right[i]);
            }
        }
        return ans;
    }
}
