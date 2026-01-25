package com.zjxjwxk.leetcode._0452_Minimum_Number_of_Arrows_to_Burst_Balloons;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 按左边界排序+贪心
 *
 * @author Xinkang Wu
 * @date 2020/11/23 11:19
 */
public class Solution2 {

    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, Comparator.comparingInt(o -> o[0]));
        int ans = 1, endIndex = points[0][1];
        for (int[] point : points) {
            if (point[0] > endIndex) {
                endIndex = point[1];
                ++ans;
            } else {
                endIndex = Math.min(endIndex, point[1]);
            }
        }
        return ans;
    }
}
