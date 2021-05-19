package com.zjxjwxk.leetcode._1738_Find_Kth_Largest_XOR_Coordinate_Value;

import java.util.Arrays;

/**
 * 二维前缀和+排序
 * @author Xinkang Wu
 * @date 2021/5/19 12:44
 */
public class Solution {

    public int kthLargestValue(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length, index = 0;
        int[] sum = new int[m * n];
        int[][] value = new int[m + 1][n + 1];
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                value[i][j] = value[i - 1][j] ^ value[i][j - 1] ^ value[i - 1][j - 1] ^ matrix[i - 1][j - 1];
                sum[index++] = value[i][j];
            }
        }
        Arrays.sort(sum);
        return sum[sum.length - k];
    }
}
