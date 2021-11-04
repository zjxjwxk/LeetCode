package com.zjxjwxk.leetcode._0407_Trapping_Rain_Water_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void trapRainWater1() {
        int[][] heightMap = {
                {1, 4, 3, 1, 3, 2}, {3, 2, 1, 3, 2, 4}, {2, 3, 3, 2, 3, 1}
        };
        int ans = 4;
        assertEquals(ans, solution.trapRainWater(heightMap));
    }

    @Test
    void trapRainWater2() {
        int[][] heightMap = {
                {3, 3, 3, 3, 3}, {3, 2, 2, 2, 3}, {3, 2, 1, 2, 3}, {3, 2, 2, 2, 3}, {3, 3, 3, 3, 3}
        };
        int ans = 10;
        assertEquals(ans, solution.trapRainWater(heightMap));
    }
}