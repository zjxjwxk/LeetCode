package com.zjxjwxk.leetcode._0363_Max_Sum_of_Rectangle_No_Larger_Than_K;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxSumSubmatrix1() {
        int[][] matrix = {{1, 0, 1}, {0, -2, 3}};
        int k = 2;
        int ans = 2;
        assertEquals(ans, solution.maxSumSubmatrix(matrix, k));
    }

    @Test
    void maxSumSubmatrix2() {
        int[][] matrix = {{2, 2, -1}};
        int k = 3;
        int ans = 3;
        assertEquals(ans, solution.maxSumSubmatrix(matrix, k));
    }
}