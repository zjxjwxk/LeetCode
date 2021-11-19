package com.zjxjwxk.leetcode._0397_Integer_Replacement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void integerReplacement1() {
        int n = 8;
        int ans = 3;
        assertEquals(ans, solution.integerReplacement(n));
    }

    @Test
    void integerReplacement2() {
        int n = 7;
        int ans = 4;
        assertEquals(ans, solution.integerReplacement(n));
    }

    @Test
    void integerReplacement3() {
        int n = 4;
        int ans = 2;
        assertEquals(ans, solution.integerReplacement(n));
    }

    @Test
    void integerReplacement4() {
        int n = 17;
        int ans = 5;
        assertEquals(ans, solution.integerReplacement(n));
    }
}