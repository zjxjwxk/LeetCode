package com.zjxjwxk.leetcode._1584_Min_Cost_to_Connect_All_Points;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minCostConnectPoints1() {
        int[][] points = {
                {0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}
        };
        int ans = 20;
        assertEquals(ans, solution.minCostConnectPoints(points));
    }

    @Test
    void minCostConnectPoints2() {
        int[][] points = {
                {3, 12}, {-2, 5}, {-4, 1}
        };
        int ans = 18;
        assertEquals(ans, solution.minCostConnectPoints(points));
    }

    @Test
    void minCostConnectPoints3() {
        int[][] points = {
                {0, 0}, {1, 1}, {1, 0}, {-1, 1}
        };
        int ans = 4;
        assertEquals(ans, solution.minCostConnectPoints(points));
    }

    @Test
    void minCostConnectPoints4() {
        int[][] points = {
                {-1000000, -1000000}, {1000000, 1000000}
        };
        int ans = 4000000;
        assertEquals(ans, solution.minCostConnectPoints(points));
    }

    @Test
    void minCostConnectPoints5() {
        int[][] points = {
                {0, 0}
        };
        int ans = 0;
        assertEquals(ans, solution.minCostConnectPoints(points));
    }
}