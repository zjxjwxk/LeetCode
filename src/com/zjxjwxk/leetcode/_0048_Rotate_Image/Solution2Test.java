package com.zjxjwxk.leetcode._0048_Rotate_Image;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void rotate1() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] ans = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        solution2.rotate(matrix);
        assertArrayEquals(ans, matrix);
    }

    @Test
    void rotate2() {
        int[][] matrix = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };
        int[][] ans = {
                {15, 13, 2, 5},
                {14, 3, 4, 1},
                {12, 6, 8, 9},
                {16, 7, 10, 11}
        };
        solution2.rotate(matrix);
        assertArrayEquals(ans, matrix);
    }
}