package com.zjxjwxk.leetcode._0789_Escape_The_Ghosts;

/**
 * 曼哈顿距离
 * @author Xinkang Wu
 * @date 2021/9/13 20:09
 */
public class Solution {

    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int distance = getDistance(new int[]{0, 0}, target);
        for (int[] ghost : ghosts) {
            if (getDistance(ghost, target) <= distance) {
                return false;
            }
        }
        return true;
    }

    private int getDistance(int[] p1, int[] p2) {
        return Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);
    }
}
