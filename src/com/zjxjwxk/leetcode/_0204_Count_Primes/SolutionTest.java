package com.zjxjwxk.leetcode._0204_Count_Primes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countPrimes1() {
        int n = 10;
        int ans = 4;
        assertEquals(ans, solution.countPrimes(n));
    }

    @Test
    void countPrimes2() {
        int n = 0;
        int ans = 0;
        assertEquals(ans, solution.countPrimes(n));
    }

    @Test
    void countPrimes3() {
        int n = 1;
        int ans = 0;
        assertEquals(ans, solution.countPrimes(n));
    }
}