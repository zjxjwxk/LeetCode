package com.zjxjwxk.leetcode._1030_Matrix_Cells_in_Distance_Order;

import java.util.ArrayList;
import java.util.List;

/**
 * 桶排序
 * @author Xinkang Wu
 * @date 2020/11/17 14:41
 */
public class Solution2 {

    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int maxDist = Math.max(r0, R - 1 - r0) + Math.max(c0, C - 1 - c0);
        List<List<int[]>> bucket = new ArrayList<>();
        for (int i = 0; i <= maxDist; ++i) {
            bucket.add(new ArrayList<>());
        }
        for (int i = 0; i < R; ++i) {
            for (int j = 0; j < C; ++j) {
                bucket.get(getDist(i, j, r0, c0)).add(new int[]{i, j});
            }
        }
        int[][] ans = new int[R * C][2];
        int index = 0;
        for (int i = 0; i <= maxDist; ++i) {
            for (int[] point : bucket.get(i)) {
                ans[index++] = point;
            }
        }
        return ans;
    }

    private int getDist(int r, int c, int r0, int c0) {
        return Math.abs(r - r0) + Math.abs(c - c0);
    }
}
