package com.zjxjwxk.leetcode._1030_Matrix_Cells_in_Distance_Order;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 自定义排序
 * @author Xinkang Wu
 * @date 2020/11/17 12:55
 */
public class Solution {

    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        Comparator<int[]> comparator = Comparator.comparingInt(o -> Math.abs(o[0] - r0) + Math.abs(o[1] - c0));
        int[][] pointArr = new int[R * C][];
        int index = 0;
        for (int i = 0; i < R; ++i) {
            for (int j = 0; j < C; ++j) {
                pointArr[index++] = new int[]{i, j};
            }
        }
        Arrays.sort(pointArr, comparator);
        return pointArr;
    }
}
