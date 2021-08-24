package com.zjxjwxk.leetcode._1337_The_K_Weakest_Rows_in_a_Matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void kWeakestRows1() {
        int[][] mat = {
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}
        };
        int k = 3;
        int[] ans = {2, 0, 3};
        assertArrayEquals(ans, solution.kWeakestRows(mat, k));
    }

    @Test
    void kWeakestRows2() {
        int[][] mat = {
                {1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 0}
        };
        int k = 2;
        int[] ans = {0, 2};
        assertArrayEquals(ans, solution.kWeakestRows(mat, k));
    }
}