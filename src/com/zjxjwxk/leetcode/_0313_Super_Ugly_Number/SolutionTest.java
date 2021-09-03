package com.zjxjwxk.leetcode._0313_Super_Ugly_Number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void nthSuperUglyNumber1() {
        int n = 12;
        int[] primes = {2, 7, 13, 19};
        int ans = 32;
        assertEquals(ans, solution.nthSuperUglyNumber(n, primes));
    }

    @Test
    void nthSuperUglyNumber2() {
        int n = 1;
        int[] primes = {2, 3, 5};
        int ans = 1;
        assertEquals(ans, solution.nthSuperUglyNumber(n, primes));
    }
}