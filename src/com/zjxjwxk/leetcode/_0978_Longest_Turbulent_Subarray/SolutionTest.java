package com.zjxjwxk.leetcode._0978_Longest_Turbulent_Subarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxTurbulenceSize1() {
        int[] arr = {9, 4, 2, 10, 7, 8, 8, 1, 9};
        int ans = 5;
        assertEquals(ans, solution.maxTurbulenceSize(arr));
    }

    @Test
    void maxTurbulenceSize2() {
        int[] arr = {4, 8, 12, 11, 12};
        int ans = 4;
        assertEquals(ans, solution.maxTurbulenceSize(arr));
    }

    @Test
    void maxTurbulenceSize3() {
        int[] arr = {100};
        int ans = 1;
        assertEquals(ans, solution.maxTurbulenceSize(arr));
    }

    @Test
    void maxTurbulenceSize4() {
        int[] arr = {9, 9};
        int ans = 1;
        assertEquals(ans, solution.maxTurbulenceSize(arr));
    }
}