package com.zjxjwxk.leetcode._3128_Right_Triangles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numberOfRightTriangles() {
        int[][] grid = new int[][]{{0, 1, 0}, {0, 1, 1}, {0, 1, 0}};
        int ans = 2;
        assertEquals(ans, solution.numberOfRightTriangles(grid));
    }

    @Test
    void numberOfRightTriangles2() {
        int[][] grid = new int[][]{{1, 0, 0, 0}, {0, 1, 0, 1}, {1, 0, 0, 0}};
        int ans = 0;
        assertEquals(ans, solution.numberOfRightTriangles(grid));
    }

    @Test
    void numberOfRightTriangles3() {
        int[][] grid = new int[][]{{1, 0, 1}, {1, 0, 0}, {1, 0, 0}};
        int ans = 2;
        assertEquals(ans, solution.numberOfRightTriangles(grid));
    }
}