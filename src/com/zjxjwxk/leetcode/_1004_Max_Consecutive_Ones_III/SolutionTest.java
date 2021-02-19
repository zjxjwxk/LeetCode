package com.zjxjwxk.leetcode._1004_Max_Consecutive_Ones_III;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void longestOnes1() {
        int[] A = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int K = 2;
        int ans = 6;
        assertEquals(ans, solution.longestOnes(A, K));
    }

    @Test
    void longestOnes2() {
        int[] A = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int K = 3;
        int ans = 10;
        assertEquals(ans, solution.longestOnes(A, K));
    }
}