package com.zjxjwxk.leetcode._3128_Right_Triangles;

import java.util.Arrays;

/**
 * @author Xinkang Wu
 * @date 2024/8/2 23:08
 */
public class Solution {

    public long numberOfRightTriangles(int[][] grid) {
        int colLen = grid[0].length;
        int[] colSum = new int[colLen];
        for (int[] row : grid) {
            for (int j = 0; j < colLen; ++j) {
                colSum[j] += row[j];
            }
        }
        long ans = 0;
        for (int[] row : grid) {
            int rowSum = Arrays.stream(row).sum();
            for (int j = 0; j < colLen; ++j) {
                if (row[j] == 1) {
                    ans += (long) (rowSum - 1) * (colSum[j] - 1);
                }
            }
        }
        return ans;
    }
}
