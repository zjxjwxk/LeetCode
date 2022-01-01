package com.zjxjwxk.leetcode._2022_Convert_1D_Array_Into_2D_Array;

/**
 * @author Xinkang Wu
 * @date 2022/1/1 20:21
 */
public class Solution {

    public int[][] construct2DArray(int[] original, int m, int n) {
        int len = original.length;
        if (len != m * n) {
            return new int[0][];
        }
        int[][] ans = new int[m][n];
        for (int i = 0; i < len; ++i) {
            ans[i / n][i % n] = original[i];
        }
        return ans;
    }
}
