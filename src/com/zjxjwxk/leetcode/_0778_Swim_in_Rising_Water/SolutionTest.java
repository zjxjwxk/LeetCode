package com.zjxjwxk.leetcode._0778_Swim_in_Rising_Water;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void swimInWater1() {
        int[][] grid = {
                {0, 2}, {1, 3}
        };
        int ans = 3;
        assertEquals(ans, solution.swimInWater(grid));
    }

    @Test
    void swimInWater2() {
        int[][] grid = {
                {0, 1, 2, 3, 4}, {24, 23, 22, 21, 5}, {12, 13, 14, 15, 16}, {11, 17, 18, 19, 20}, {10, 9, 8, 7, 6}
        };
        int ans = 16;
        assertEquals(ans, solution.swimInWater(grid));
    }
}