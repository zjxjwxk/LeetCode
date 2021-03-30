package com.zjxjwxk.leetcode._0074_Search_a_2D_Matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void searchMatrix1() {
        int[][] matrix = new int[][]{
                {1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}
        };
        int target = 3;
        assertTrue(solution.searchMatrix(matrix, target));
    }

    @Test
    void searchMatrix2() {
        int[][] matrix = new int[][]{
                {1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}
        };
        int target = 13;
        assertFalse(solution.searchMatrix(matrix, target));
    }

    @Test
    void searchMatrix3() {
        int[][] matrix = new int[][]{
                {1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}
        };
        int target = 0;
        assertFalse(solution.searchMatrix(matrix, target));
    }

    @Test
    void searchMatrix4() {
        int[][] matrix = new int[][]{
                {1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}
        };
        int target = 8;
        assertFalse(solution.searchMatrix(matrix, target));
    }

    @Test
    void searchMatrix5() {
        int[][] matrix = new int[][]{
                {1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}
        };
        int target = 61;
        assertFalse(solution.searchMatrix(matrix, target));
    }
}