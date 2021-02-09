package com.zjxjwxk.leetcode._0992_Subarrays_with_K_Different_Integers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void subarraysWithKDistinct1() {
        int[] A = {1, 2, 1, 2, 3};
        int K = 2;
        int ans = 7;
        assertEquals(ans, solution.subarraysWithKDistinct(A, K));
    }

    @Test
    void subarraysWithKDistinct2() {
        int[] A = {1, 2, 1, 3, 4};
        int K = 3;
        int ans = 3;
        assertEquals(ans, solution.subarraysWithKDistinct(A, K));
    }
}