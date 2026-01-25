package com.zjxjwxk.leetcode._0452_Minimum_Number_of_Arrows_to_Burst_Balloons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void findMinArrowShots1() {
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        int ans = 2;
        assertEquals(ans, solution2.findMinArrowShots(points));
    }

    @Test
    void findMinArrowShots2() {
        int[][] points = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int ans = 4;
        assertEquals(ans, solution2.findMinArrowShots(points));
    }

    @Test
    void findMinArrowShots3() {
        int[][] points = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        int ans = 2;
        assertEquals(ans, solution2.findMinArrowShots(points));
    }

    @Test
    void findMinArrowShots4() {
        int[][] points = {{1, 2}};
        int ans = 1;
        assertEquals(ans, solution2.findMinArrowShots(points));
    }

    @Test
    void findMinArrowShots5() {
        int[][] points = {{2, 3}, {2, 3}};
        int ans = 1;
        assertEquals(ans, solution2.findMinArrowShots(points));
    }

    @Test
    void findMinArrowShots6() {
        int[][] points = {{-2147483646, -2147483645}, {2147483646, 2147483647}};
        int ans = 2;
        assertEquals(ans, solution2.findMinArrowShots(points));
    }

    @Test
    void findMinArrowShots7() {
        int[][] points = {{3, 9}, {7, 12}, {3, 8}, {6, 8}, {9, 10}, {2, 9}, {0, 9}, {3, 9}, {0, 6}, {2, 8}};
        int ans = 2;
        assertEquals(ans, solution2.findMinArrowShots(points));
    }
}