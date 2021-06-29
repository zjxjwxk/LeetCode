package com.zjxjwxk.leetcode._0815_Bus_Routes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numBusesToDestination1() {
        int[][] routes = {{1, 2, 7}, {3, 6, 7}};
        int source = 1, target = 6;
        int ans = 2;
        assertEquals(ans, solution.numBusesToDestination(routes, source, target));
    }

    @Test
    void numBusesToDestination2() {
        int[][] routes = {{7, 12}, {4, 5, 15}, {6}, {15, 19}, {9, 12, 13}};
        int source = 15, target = 12;
        int ans = -1;
        assertEquals(ans, solution.numBusesToDestination(routes, source, target));
    }

    @Test
    void numBusesToDestination3() {
        int[][] routes = {{2}, {2, 8}};
        int source = 8, target = 2;
        int ans = 1;
        assertEquals(ans, solution.numBusesToDestination(routes, source, target));
    }
}