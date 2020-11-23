package com.zjxjwxk.leetcode._0452_Minimum_Number_of_Arrows_to_Burst_Balloons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findMinArrowShots1() {
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        int ans = 2;
        assertEquals(ans, solution.findMinArrowShots(points));
    }

    @Test
    void findMinArrowShots2() {
        int[][] points = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int ans = 4;
        assertEquals(ans, solution.findMinArrowShots(points));
    }

    @Test
    void findMinArrowShots3() {
        int[][] points = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        int ans = 2;
        assertEquals(ans, solution.findMinArrowShots(points));
    }

    @Test
    void findMinArrowShots4() {
        int[][] points = {{1, 2}};
        int ans = 1;
        assertEquals(ans, solution.findMinArrowShots(points));
    }

    @Test
    void findMinArrowShots5() {
        int[][] points = {{2, 3}, {2, 3}};
        int ans = 1;
        assertEquals(ans, solution.findMinArrowShots(points));
    }
}