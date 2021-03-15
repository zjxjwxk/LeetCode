package com.zjxjwxk.leetcode._0054_Spiral_Matrix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void spiralOrder1() {
        int[][] matrix = new int[][]{
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };
        List<Integer> ans = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
        assertEquals(ans, solution.spiralOrder(matrix));
    }

    @Test
    void spiralOrder2() {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}
        };
        List<Integer> ans = Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
        assertEquals(ans, solution.spiralOrder(matrix));
    }

    @Test
    void spiralOrder3() {
        int[][] matrix = new int[][]{
                {7, 9, 6}
        };
        List<Integer> ans = Arrays.asList(7, 9, 6);
        assertEquals(ans, solution.spiralOrder(matrix));
    }

    @Test
    void spiralOrder4() {
        int[][] matrix = new int[][]{
                {7}, {9}, {6}
        };
        List<Integer> ans = Arrays.asList(7, 9, 6);
        assertEquals(ans, solution.spiralOrder(matrix));
    }

    @Test
    void spiralOrder5() {
        int[][] matrix = new int[][]{
                {1}, {2}, {3}, {4}, {5}, {6}, {7}, {8}, {9}, {10}
        };
        List<Integer> ans = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(ans, solution.spiralOrder(matrix));
    }
}