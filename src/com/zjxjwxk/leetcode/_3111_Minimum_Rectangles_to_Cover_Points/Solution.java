package com.zjxjwxk.leetcode._3111_Minimum_Rectangles_to_Cover_Points;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Xinkang Wu
 * @date 2024/8/1 01:51
 */
public class Solution {

    public int minRectanglesToCoverPoints(int[][] points, int w) {
        Arrays.sort(points, Comparator.comparingInt(point -> point[0]));
        int ans = 1, left = points[0][0];
        for (int[] point : points) {
            if (point[0] - left > w) {
                ++ans;
                left = point[0];
            }
        }
        return ans;
    }
}
