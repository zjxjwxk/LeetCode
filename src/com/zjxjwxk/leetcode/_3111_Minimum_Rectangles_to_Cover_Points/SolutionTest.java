package com.zjxjwxk.leetcode._3111_Minimum_Rectangles_to_Cover_Points;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minRectanglesToCoverPoints() {
        int[][] points = {{2, 1}, {1, 0}, {1, 4}, {1, 8}, {3, 5}, {4, 6}};
        int w = 1;
        int ans = 2;
        assertEquals(ans, solution.minRectanglesToCoverPoints(points, w));
    }

    @Test
    void minRectanglesToCoverPoints2() {
        int[][] points = {{0, 0}, {1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}, {6, 6}};
        int w = 2;
        int ans = 3;
        assertEquals(ans, solution.minRectanglesToCoverPoints(points, w));
    }

    @Test
    void minRectanglesToCoverPoints3() {
        int[][] points = {{2, 3}, {1, 2}};
        int w = 0;
        int ans = 2;
        assertEquals(ans, solution.minRectanglesToCoverPoints(points, w));
    }
}