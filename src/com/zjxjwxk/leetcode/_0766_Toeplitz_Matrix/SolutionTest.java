package com.zjxjwxk.leetcode._0766_Toeplitz_Matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isToeplitzMatrix1() {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 1, 2, 3},
                {9, 5, 1, 2}
        };
        assertTrue(solution.isToeplitzMatrix(matrix));
    }

    @Test
    void isToeplitzMatrix2() {
        int[][] matrix = new int[][]{
                {1, 2},
                {2, 2}
        };
        assertFalse(solution.isToeplitzMatrix(matrix));
    }

    @Test
    void isToeplitzMatrix3() {
        int[][] matrix = new int[][]{
                {1, 2, 3}
        };
        assertTrue(solution.isToeplitzMatrix(matrix));
    }

    @Test
    void isToeplitzMatrix4() {
        int[][] matrix = new int[][]{
                {1},
                {2},
                {3}
        };
        assertTrue(solution.isToeplitzMatrix(matrix));
    }
}