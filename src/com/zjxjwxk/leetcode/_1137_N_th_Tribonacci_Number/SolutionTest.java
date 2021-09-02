package com.zjxjwxk.leetcode._1137_N_th_Tribonacci_Number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void tribonacci1() {
        int n = 4;
        int ans = 4;
        assertEquals(ans, solution.tribonacci(n));
    }

    @Test
    void tribonacci2() {
        int n = 25;
        int ans = 1389537;
        assertEquals(ans, solution.tribonacci(n));
    }
}