package com.zjxjwxk.leetcode._0803_Bricks_Falling_When_Hit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void hitBricks1() {
        int[][] grid = {{1, 0, 0, 0}, {1, 1, 1, 0}};
        int[][] hits = {{1, 0}};
        int[] ans = {2};
        assertArrayEquals(ans, solution.hitBricks(grid, hits));
    }

    @Test
    void hitBricks2() {
        int[][] grid = {{1, 0, 0, 0}, {1, 1, 0, 0}};
        int[][] hits = {{1, 1}, {1, 0}};
        int[] ans = {0, 0};
        assertArrayEquals(ans, solution.hitBricks(grid, hits));
    }

    @Test
    void hitBricks3() {
        int[][] grid = {{1, 0, 1}, {1, 1, 1}};
        int[][] hits = {{0, 0}, {0, 2}, {1, 1}};
        int[] ans = {0, 3, 0};
        assertArrayEquals(ans, solution.hitBricks(grid, hits));
    }

    @Test
    void hitBricks4() {
        int[][] grid = {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};
        int[][] hits = {{0, 2}, {2, 0}, {0, 1}, {1, 2}};
        int[] ans = {0, 0, 1, 0};
        assertArrayEquals(ans, solution.hitBricks(grid, hits));
    }
}