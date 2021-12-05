package com.zjxjwxk.leetcode._0372_Super_Pow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void superPow1() {
        int a = 2;
        int[] b = {3};
        int ans = 8;
        assertEquals(ans, solution.superPow(a, b));
    }

    @Test
    void superPow2() {
        int a = 2;
        int[] b = {1, 0};
        int ans = 1024;
        assertEquals(ans, solution.superPow(a, b));
    }

    @Test
    void superPow3() {
        int a = 1;
        int[] b = {4, 3, 3, 8, 5, 2};
        int ans = 1;
        assertEquals(ans, solution.superPow(a, b));
    }

    @Test
    void superPow4() {
        int a = 2147483647;
        int[] b = {2, 0, 0};
        int ans = 1198;
        assertEquals(ans, solution.superPow(a, b));
    }
}