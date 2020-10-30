package com.zjxjwxk.leetcode._0463_Island_Perimeter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void islandPerimeter() {
        int[][] grid = {{0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        int ans = 16, result = solution2.islandPerimeter(grid);
        assertEquals(ans, result);
    }
}