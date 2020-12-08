package com.zjxjwxk.leetcode._0861_Score_After_Flipping_Matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void matrixScore() {
        int[][] A = {{0, 0, 1, 1}, {1, 0, 1, 0}, {1, 1, 0, 0}};
        int ans = 39;
        assertEquals(ans, solution.matrixScore(A));
    }
}