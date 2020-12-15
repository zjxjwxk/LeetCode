package com.zjxjwxk.leetcode._0738_Monotone_Increasing_Digits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void monotoneIncreasingDigits1() {
        int N = 10;
        int ans = 9;
        assertEquals(ans, solution.monotoneIncreasingDigits(N));
    }

    @Test
    void monotoneIncreasingDigits2() {
        int N = 1234;
        int ans = 1234;
        assertEquals(ans, solution.monotoneIncreasingDigits(N));
    }

    @Test
    void monotoneIncreasingDigits3() {
        int N = 332;
        int ans = 299;
        assertEquals(ans, solution.monotoneIncreasingDigits(N));
    }

    @Test
    void monotoneIncreasingDigits4() {
        int N = 100;
        int ans = 99;
        assertEquals(ans, solution.monotoneIncreasingDigits(N));
    }
}