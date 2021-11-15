package com.zjxjwxk.leetcode._0319_Bulb_Switcher;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void bulbSwitch1() {
        int n = 3;
        int ans = 1;
        assertEquals(ans, solution.bulbSwitch(n));
    }

    @Test
    void bulbSwitch2() {
        int n = 0;
        int ans = 0;
        assertEquals(ans, solution.bulbSwitch(n));
    }

    @Test
    void bulbSwitch3() {
        int n = 1;
        int ans = 1;
        assertEquals(ans, solution.bulbSwitch(n));
    }
}