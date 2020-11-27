package com.zjxjwxk.leetcode._0454_4Sum_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void fourSumCount() {
        int[] A = {1, 2}, B = {-2, -1}, C = {-1, 2}, D = {0, 2};
        int ans = 2;
        assertEquals(ans, solution.fourSumCount(A, B, C, D));
    }
}