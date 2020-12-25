package com.zjxjwxk.leetcode._0455_Assign_Cookies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findContentChildren1() {
        int[] g = {1, 2, 3}, s = {1, 1};
        int ans = 1;
        assertEquals(ans, solution.findContentChildren(g, s));
    }

    @Test
    void findContentChildren2() {
        int[] g = {1, 2}, s = {1, 2, 3};
        int ans = 2;
        assertEquals(ans, solution.findContentChildren(g, s));
    }
}