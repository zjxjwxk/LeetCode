package com.zjxjwxk.leetcode._0223_Rectangle_Area;

/**
 * @author Xinkang Wu
 * @date 2021/9/30 22:35
 */
public class Solution {

    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int s1 = Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2);
        int s2 = Math.abs(bx1 - bx2) * Math.abs(by1 - by2);
        int overlapWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        int overlapHeight = Math.min(ay2, by2) - Math.max(ay1, by1);
        return s1 + s2 - Math.max(overlapWidth, 0) * Math.max(overlapHeight, 0);
    }
}
