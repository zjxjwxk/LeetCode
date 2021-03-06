package com.zjxjwxk.leetcode._0556_Next_Greater_Element_III;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void nextGreaterElement1() {
        int n = 12;
        int ans = 21;
        assertEquals(ans, solution.nextGreaterElement(n));
    }

    @Test
    void nextGreaterElement2() {
        int n = 21;
        int ans = -1;
        assertEquals(ans, solution.nextGreaterElement(n));
    }

    @Test
    void nextGreaterElement3() {
        int n = 1254321;
        int ans = 1312245;
        assertEquals(ans, solution.nextGreaterElement(n));
    }

    @Test
    void nextGreaterElement4() {
        int n = Integer.MAX_VALUE;
        int ans = -1;
        assertEquals(ans, solution.nextGreaterElement(n));
    }

    @Test
    void nextGreaterElement5() {
        int n = 1999999999;
        int ans = -1;
        assertEquals(ans, solution.nextGreaterElement(n));
    }
}