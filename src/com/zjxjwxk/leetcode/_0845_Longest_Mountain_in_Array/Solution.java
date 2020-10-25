package com.zjxjwxk.leetcode._0845_Longest_Mountain_in_Array;

/**
 * 一次遍历（我的解法）
 * @author Xinkang Wu
 * @date 2020/10/25 8:34 上午
 */
public class Solution {

    public int longestMountain(int[] A) {
        int len = A.length, leftCount = 0, rightCount = 0, ans = 0;
        for (int i = 1; i < len; ++i) {
            if (A[i] > A[i - 1]) {
                if (rightCount != 0) {
                    ans = Math.max(ans, leftCount + 1 + rightCount);
                    leftCount = 0;
                    rightCount = 0;
                }
                ++leftCount;
            } else if (A[i] < A[i - 1]) {
                if (leftCount != 0) {
                    ++rightCount;
                }
            } else {
                if (rightCount != 0) {
                    ans = Math.max(ans, leftCount + 1 + rightCount);
                    rightCount = 0;
                }
                leftCount = 0;
            }
        }
        if (rightCount != 0) {
            ans = Math.max(ans, leftCount + 1 + rightCount);
        }
        return ans;
    }
}
