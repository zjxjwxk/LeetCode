package com.zjxjwxk.leetcode._3143_Maximum_Points_Inside_the_Square;

import java.util.*;

/**
 * 维护边界（次小距离）
 * @author Xinkang Wu
 * @date 2024/8/3 23:46
 */
public class Solution {

    public int maxPointsInsideSquare(int[][] points, String s) {
        int[] minDis = new int[26];
        Arrays.fill(minDis, Integer.MAX_VALUE);
        int border = Integer.MAX_VALUE, ans = 0;
        for (int i = 0; i < points.length; ++i) {
            int[] point = points[i];
            int dis = Math.max(Math.abs(point[0]), Math.abs(point[1])), ch = s.charAt(i) - 'a';
            if (dis < minDis[ch]) {
                border = Math.min(border, minDis[ch]);
                minDis[ch] = dis;
            } else {
                border = Math.min(border, dis);
            }
        }
        for (int dis : minDis) {
            if (dis < border) {
                ++ans;
            }
        }
        return ans;
    }
}
