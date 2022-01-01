package com.zjxjwxk.leetcode._2022_Convert_1D_Array_Into_2D_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void construct2DArray1() {
        int[] original = {1, 2, 3, 4};
        int m = 2, n = 2;
        int[][] ans = {{1, 2}, {3, 4}};
        assertArrayEquals(ans, solution.construct2DArray(original, m, n));
    }

    @Test
    void construct2DArray2() {
        int[] original = {1, 2, 3};
        int m = 1, n = 3;
        int[][] ans = {{1, 2, 3}};
        assertArrayEquals(ans, solution.construct2DArray(original, m, n));
    }

    @Test
    void construct2DArray3() {
        int[] original = {1, 2};
        int m = 1, n = 1;
        int[][] ans = {};
        assertArrayEquals(ans, solution.construct2DArray(original, m, n));
    }

    @Test
    void construct2DArray4() {
        int[] original = {3};
        int m = 1, n = 2;
        int[][] ans = {};
        assertArrayEquals(ans, solution.construct2DArray(original, m, n));
    }
}