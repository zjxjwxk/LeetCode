package com.zjxjwxk.leetcode._1232_Check_If_It_Is_a_Straight_Line;

/**
 * 点斜式
 * y=kx+b
 * @author Xinkang Wu
 * @date 2021/1/17 09:51
 */
public class Solution {

    public boolean checkStraightLine(int[][] coordinates) {
        int len = coordinates.length;
        if (coordinates[1][0] == coordinates[0][0]) {
            for (int i = 2; i < len; ++i) {
                if (coordinates[i][0] != coordinates[0][0]) {
                    return false;
                }
            }
            return true;
        }
        double k = ((double) (coordinates[1][1] - coordinates[0][1])) / (coordinates[1][0] - coordinates[0][0]);
        double b = coordinates[0][1] - k * coordinates[0][0];
        for (int i = 2; i < len; ++i) {
            if (coordinates[i][1] != k * coordinates[i][0] + b) {
                return false;
            }
        }
        return true;
    }
}
