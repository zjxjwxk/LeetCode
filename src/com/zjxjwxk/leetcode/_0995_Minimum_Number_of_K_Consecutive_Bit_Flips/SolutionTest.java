package com.zjxjwxk.leetcode._0995_Minimum_Number_of_K_Consecutive_Bit_Flips;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minKBitFlips1() {
        int[] A = {0, 1, 0};
        int K = 1;
        int ans = 2;
        assertEquals(ans, solution.minKBitFlips(A, K));
    }

    @Test
    void minKBitFlips2() {
        int[] A = {1, 1, 0};
        int K = 2;
        int ans = -1;
        assertEquals(ans, solution.minKBitFlips(A, K));
    }

    @Test
    void minKBitFlips3() {
        int[] A = {0, 0, 0, 1, 0, 1, 1, 0};
        int K = 3;
        int ans = 3;
        assertEquals(ans, solution.minKBitFlips(A, K));
    }
}