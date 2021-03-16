package com.zjxjwxk.leetcode._0059_Spiral_Matrix_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void generateMatrix1() {
        int n = 3;
        int[][] ans = new int[][]{
                {1, 2, 3}, {8, 9, 4}, {7, 6, 5}
        };
        assertArrayEquals(ans, solution.generateMatrix(n));
    }

    @Test
    void generateMatrix2() {
        int n = 1;
        int[][] ans = new int[][]{
                {1}
        };
        assertArrayEquals(ans, solution.generateMatrix(n));
    }
}