package com.zjxjwxk.leetcode._0526_Beautiful_Arrangement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countArrangement1() {
        int n = 2;
        int ans = 2;
        assertEquals(ans, solution.countArrangement(n));
    }

    @Test
    void countArrangement2() {
        int n = 1;
        int ans = 1;
        assertEquals(ans, solution.countArrangement(n));
    }

    @Test
    void countArrangement3() {
        int n = 3;
        int ans = 3;
        assertEquals(ans, solution.countArrangement(n));
    }
}