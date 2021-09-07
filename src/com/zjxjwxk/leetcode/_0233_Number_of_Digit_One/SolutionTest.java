package com.zjxjwxk.leetcode._0233_Number_of_Digit_One;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countDigitOne1() {
        int n = 13;
        int ans = 6;
        assertEquals(ans, solution.countDigitOne(n));
    }

    @Test
    void countDigitOne2() {
        int n = 0;
        int ans = 0;
        assertEquals(ans, solution.countDigitOne(n));
    }
}