package com.zjxjwxk.leetcode._0629_K_Inverse_Pairs_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void kInversePairs1() {
        int n = 3, k = 0;
        int ans = 1;
        assertEquals(ans, solution.kInversePairs(n, k));
    }

    @Test
    void kInversePairs2() {
        int n = 3, k = 1;
        int ans = 2;
        assertEquals(ans, solution.kInversePairs(n, k));
    }
}