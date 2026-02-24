package com.zjxjwxk.leetcode._0427_Construct_Quad_Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void construct() {
        int[][] grid = {
                {0, 1},
                {1, 0}
        };
        Node ans = solution.construct(grid);
        // Debug to check answer
        assertNotNull(ans);
    }

    @Test
    void construct2() {
        int[][] grid = {
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0}
        };
        Node ans = solution.construct(grid);
        // Debug to check answer
        assertNotNull(ans);
    }
}