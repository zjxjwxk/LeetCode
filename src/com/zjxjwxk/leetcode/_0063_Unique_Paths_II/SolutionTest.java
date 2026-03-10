package com.zjxjwxk.leetcode._0063_Unique_Paths_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void uniquePathsWithObstacles() {
        int[][] obstacleGrid = {
                {0, 0, 0}, {0, 1, 0}, {0, 0, 0}
        };
        int ans = 2;
        assertEquals(ans, solution.uniquePathsWithObstacles(obstacleGrid));
    }

    @Test
    void uniquePathsWithObstacles2() {
        int[][] obstacleGrid = {
                {0, 1}, {0, 0}
        };
        int ans = 1;
        assertEquals(ans, solution.uniquePathsWithObstacles(obstacleGrid));
    }
}