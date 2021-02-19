package com.zjxjwxk.leetcode._1004_Max_Consecutive_Ones_III;

/**
 * 滑动窗口
 * @author Xinkang Wu
 * @date 2021/2/19 13:33
 */
public class Solution {

    public int longestOnes(int[] A, int K) {
        int len = A.length, zeroCount = 0, i = 0, j = 0, ans = 0;
        while (j < len) {
            if (A[j] == 0) {
                ans = Math.max(ans, j - i);
                ++zeroCount;
                while (zeroCount > K) {
                    if (A[i] == 0) {
                        --zeroCount;
                    }
                    ++i;
                }
            }
            ++j;
        }
        ans = Math.max(ans, j - i);
        return ans;
    }
}
