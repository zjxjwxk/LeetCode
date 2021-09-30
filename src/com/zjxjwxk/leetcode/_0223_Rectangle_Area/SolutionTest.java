package com.zjxjwxk.leetcode._0223_Rectangle_Area;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void computeArea1() {
        int ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2;
        int ans = 45;
        assertEquals(ans, solution.computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2));
    }

    @Test
    void computeArea2() {
        int ax1 = -2, ay1 = -2, ax2 = 2, ay2 = 2, bx1 = -2, by1 = -2, bx2 = 2, by2 = 2;
        int ans = 16;
        assertEquals(ans, solution.computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2));
    }
}