package com.zjxjwxk.leetcode._0861_Score_After_Flipping_Matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void matrixScore() {
        int[][] A = {{0, 0, 1, 1}, {1, 0, 1, 0}, {1, 1, 0, 0}};
        int ans = 39;
        assertEquals(ans, solution2.matrixScore(A));
    }
}