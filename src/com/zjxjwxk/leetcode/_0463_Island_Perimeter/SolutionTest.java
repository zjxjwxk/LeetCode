package com.zjxjwxk.leetcode._0463_Island_Perimeter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void islandPerimeter() {
        int[][] grid = {{0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        int ans = 16, result = solution.islandPerimeter(grid);
        assertEquals(ans, result);
    }
}