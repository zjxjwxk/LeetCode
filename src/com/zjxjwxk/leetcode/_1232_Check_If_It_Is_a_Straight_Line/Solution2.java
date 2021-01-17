package com.zjxjwxk.leetcode._1232_Check_If_It_Is_a_Straight_Line;

/**
 * 平移后，方程式
 * Ax+By=0
 * @author Xinkang Wu
 * @date 2021/1/17 10:05
 */
public class Solution2 {

    public boolean checkStraightLine(int[][] coordinates) {
        int deltaX = coordinates[0][0], deltaY = coordinates[0][1], len = coordinates.length;
        for (int i = 0; i < len; ++i) {
            coordinates[i][0] -= deltaX;
            coordinates[i][1] -= deltaY;
        }
        int A = coordinates[1][1], B = -coordinates[1][0];
        for (int i = 2; i < len; ++i) {
            if (A * coordinates[i][0] + B * coordinates[i][1] != 0) {
                return false;
            }
        }
        return true;
    }
}
