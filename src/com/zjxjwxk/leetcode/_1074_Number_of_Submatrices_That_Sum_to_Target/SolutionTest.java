package com.zjxjwxk.leetcode._1074_Number_of_Submatrices_That_Sum_to_Target;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numSubmatrixSumTarget1() {
        int[][] matrix = {
                {0, 1, 0}, {1, 1, 1}, {0, 1, 0}
        };
        int target = 0;
        int ans = 4;
        assertEquals(ans, solution.numSubmatrixSumTarget(matrix, target));
    }

    @Test
    void numSubmatrixSumTarget2() {
        int[][] matrix = {
                {1, -1}, {-1, 1}
        };
        int target = 0;
        int ans = 5;
        assertEquals(ans, solution.numSubmatrixSumTarget(matrix, target));
    }

    @Test
    void numSubmatrixSumTarget3() {
        int[][] matrix = {
                {904}
        };
        int target = 0;
        int ans = 0;
        assertEquals(ans, solution.numSubmatrixSumTarget(matrix, target));
    }
}