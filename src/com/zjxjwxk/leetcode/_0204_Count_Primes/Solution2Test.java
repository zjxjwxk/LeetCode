package com.zjxjwxk.leetcode._0204_Count_Primes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void countPrimes1() {
        int n = 10;
        int ans = 4;
        assertEquals(ans, solution2.countPrimes(n));
    }

    @Test
    void countPrimes2() {
        int n = 0;
        int ans = 0;
        assertEquals(ans, solution2.countPrimes(n));
    }

    @Test
    void countPrimes3() {
        int n = 1;
        int ans = 0;
        assertEquals(ans, solution2.countPrimes(n));
    }

    @Test
    void countPrimes4() {
        int n = 499979;
        int ans = 41537;
        assertEquals(ans, solution2.countPrimes(n));
    }
}