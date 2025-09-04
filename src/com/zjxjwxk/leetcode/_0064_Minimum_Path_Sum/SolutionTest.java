package com.zjxjwxk.leetcode._0064_Minimum_Path_Sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minPathSum() {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int ans = 7;
        assertEquals(ans, solution.minPathSum(grid));
    }

    @Test
    void minPathSum2() {
        int[][] grid = {{1, 2, 3}, {4, 5, 6}};
        int ans = 12;
        assertEquals(ans, solution.minPathSum(grid));
    }
}