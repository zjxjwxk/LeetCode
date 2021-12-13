package com.zjxjwxk.leetcode._0807_Max_Increase_to_Keep_City_Skyline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxIncreaseKeepingSkyline1() {
        int[][] grid = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        int ans = 35;
        assertEquals(ans, solution.maxIncreaseKeepingSkyline(grid));
    }

    @Test
    void maxIncreaseKeepingSkyline2() {
        int[][] grid = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int ans = 0;
        assertEquals(ans, solution.maxIncreaseKeepingSkyline(grid));
    }
}