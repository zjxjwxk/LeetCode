package com.zjxjwxk.leetcode._1034_Coloring_A_Border;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void colorBorder1() {
        int[][] grid = {{1, 1}, {1, 2}};
        int row = 0, col = 0, color = 3;
        int[][] ans = {{3, 3}, {3, 2}};
        assertArrayEquals(ans, solution.colorBorder(grid, row, col, color));
    }

    @Test
    void colorBorder2() {
        int[][] grid = {{1, 2, 2}, {2, 3, 2}};
        int row = 0, col = 1, color = 3;
        int[][] ans = {{1, 3, 3}, {2, 3, 3}};
        assertArrayEquals(ans, solution.colorBorder(grid, row, col, color));
    }

    @Test
    void colorBorder3() {
        int[][] grid = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int row = 1, col = 1, color = 2;
        int[][] ans = {{2, 2, 2}, {2, 1, 2}, {2, 2, 2}};
        assertArrayEquals(ans, solution.colorBorder(grid, row, col, color));
    }

    @Test
    void colorBorder4() {
        int[][] grid = {{1, 2, 1, 2, 1, 2}, {2, 2, 2, 2, 1, 2}, {1, 2, 2, 2, 1, 2}};
        int row = 1, col = 3, color = 1;
        int[][] ans = {{1, 1, 1, 1, 1, 2}, {1, 2, 1, 1, 1, 2}, {1, 1, 1, 1, 1, 2}};
        assertArrayEquals(ans, solution.colorBorder(grid, row, col, color));
    }
}