package com.zjxjwxk.leetcode._0832_Flipping_an_Image;

/**
 * 模拟优化+双指针
 * @author Xinkang Wu
 * @date 2021/2/24 14:42
 */
public class Solution {

    public int[][] flipAndInvertImage(int[][] A) {
        int n = A.length;
        for (int i = 0; i < n; ++i) {
            int left = 0, right = n - 1;
            while (left < right) {
                if (A[i][left] == A[i][right]) {
                    A[i][left] ^= 1;
                    A[i][right] ^= 1;
                }
                ++left;
                --right;
            }
            if (left == right) {
                A[i][left] ^= 1;
            }
        }
        return A;
    }
}
