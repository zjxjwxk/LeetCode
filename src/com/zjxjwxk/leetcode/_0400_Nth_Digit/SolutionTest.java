package com.zjxjwxk.leetcode._0400_Nth_Digit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findNthDigit1() {
        int n = 3;
        int ans = 3;
        assertEquals(ans, solution.findNthDigit(n));
    }

    @Test
    void findNthDigit2() {
        int n = 11;
        int ans = 0;
        assertEquals(ans, solution.findNthDigit(n));
    }

    @Test
    void findNthDigit3() {
        int n = 9;
        int ans = 9;
        assertEquals(ans, solution.findNthDigit(n));
    }

    @Test
    void findNthDigit4() {
        int n = 10;
        int ans = 1;
        assertEquals(ans, solution.findNthDigit(n));
    }

    @Test
    void findNthDigit5() {
        int n = 14;
        int ans = 1;
        assertEquals(ans, solution.findNthDigit(n));
    }

    @Test
    void findNthDigit6() {
        int n = 15;
        int ans = 2;
        assertEquals(ans, solution.findNthDigit(n));
    }

    @Test
    void findNthDigit7() {
        int n = 1;
        int ans = 1;
        assertEquals(ans, solution.findNthDigit(n));
    }

    @Test
    void findNthDigit8() {
        int n = 1000;
        int ans = 3;
        assertEquals(ans, solution.findNthDigit(n));
    }

    @Test
    void findNthDigit9() {
        int n = 1000000000;
        int ans = 1;
        assertEquals(ans, solution.findNthDigit(n));
    }
}