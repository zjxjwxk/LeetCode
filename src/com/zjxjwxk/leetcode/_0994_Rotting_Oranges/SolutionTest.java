package com.zjxjwxk.leetcode._0994_Rotting_Oranges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void orangesRotting() {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int ans = 4;
        assertEquals(ans, solution.orangesRotting(grid));
    }

    @Test
    void orangesRotting2() {
        int[][] grid = {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        int ans = -1;
        assertEquals(ans, solution.orangesRotting(grid));
    }

    @Test
    void orangesRotting3() {
        int[][] grid = {{0, 2}};
        int ans = 0;
        assertEquals(ans, solution.orangesRotting(grid));
    }
}