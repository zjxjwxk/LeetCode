package com.zjxjwxk.leetcode._0566_Reshape_the_Matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void matrixReshap1() {
        int[][] nums = {
                {1, 2},
                {3, 4}
        };
        int r = 1, c = 4;
        int[][] ans = {
                {1, 2, 3, 4}
        };
        assertArrayEquals(ans, solution.matrixReshape(nums, r, c));
    }

    @Test
    void matrixReshape2() {
        int[][] nums = {
                {1, 2},
                {3, 4}
        };
        int r = 2, c = 4;
        int[][] ans = {
                {1, 2},
                {3, 4}
        };
        assertArrayEquals(ans, solution.matrixReshape(nums, r, c));
    }

    @Test
    void matrixReshape3() {
        int[][] nums = {
                {1, 2, 3, 4}
        };
        int r = 2, c = 2;
        int[][] ans = {
                {1, 2},
                {3, 4}
        };
        assertArrayEquals(ans, solution.matrixReshape(nums, r, c));
    }
}