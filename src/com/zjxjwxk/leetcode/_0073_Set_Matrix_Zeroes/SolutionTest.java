package com.zjxjwxk.leetcode._0073_Set_Matrix_Zeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void setZeroes1() {
        int[][] matrix = new int[][]{
                {1, 1, 1}, {1, 0, 1}, {1, 1, 1}
        };
        int[][] ans = new int[][]{
                {1, 0, 1}, {0, 0, 0}, {1, 0, 1}
        };
        solution.setZeroes(matrix);
        assertArrayEquals(ans, matrix);
    }

    @Test
    void setZeroes2() {
        int[][] matrix = new int[][]{
                {0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}
        };
        int[][] ans = new int[][]{
                {0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}
        };
        solution.setZeroes(matrix);
        assertArrayEquals(ans, matrix);
    }
}