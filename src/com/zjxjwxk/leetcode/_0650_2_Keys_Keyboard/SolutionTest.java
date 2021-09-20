package com.zjxjwxk.leetcode._0650_2_Keys_Keyboard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minSteps1() {
        int n = 3;
        int ans = 3;
        assertEquals(ans, solution.minSteps(n));
    }

    @Test
    void minSteps2() {
        int n = 1;
        int ans = 0;
        assertEquals(ans, solution.minSteps(n));
    }

    @Test
    void minSteps3() {
        int n = 17;
        int ans = 17;
        assertEquals(ans, solution.minSteps(n));
    }

    @Test
    void minSteps4() {
        int n = 2;
        int ans = 2;
        assertEquals(ans, solution.minSteps(n));
    }

    @Test
    void minSteps5() {
        int n = 9;
        int ans = 6;
        assertEquals(ans, solution.minSteps(n));
    }

    @Test
    void minSteps6() {
        int n = 20;
        int ans = 9;
        assertEquals(ans, solution.minSteps(n));
    }
}