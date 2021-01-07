package com.zjxjwxk.leetcode._0547_Number_of_Provinces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findCircleNum1() {
        int[][] isConnected = new int[][]{
                {1, 1, 0}, {1, 1, 0}, {0, 0, 1}
        };
        int ans = 2;
        assertEquals(ans, solution.findCircleNum(isConnected));
    }

    @Test
    void findCircleNum2() {
        int[][] isConnected = new int[][]{
                {1, 0, 0}, {0, 1, 0}, {0, 0, 1}
        };
        int ans = 3;
        assertEquals(ans, solution.findCircleNum(isConnected));
    }

    @Test
    void findCircleNum3() {
        int[][] isConnected = new int[][]{
                {1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 1}, {1, 0, 1, 1}
        };
        int ans = 1;
        assertEquals(ans, solution.findCircleNum(isConnected));
    }
}