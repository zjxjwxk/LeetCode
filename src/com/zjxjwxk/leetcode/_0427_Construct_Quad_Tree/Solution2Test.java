package com.zjxjwxk.leetcode._0427_Construct_Quad_Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void construct() {
        int[][] grid = {
                {0, 1},
                {1, 0}
        };
        Node ans = solution2.construct(grid);
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
        Node ans = solution2.construct(grid);
        // Debug to check answer
        assertNotNull(ans);
    }
}