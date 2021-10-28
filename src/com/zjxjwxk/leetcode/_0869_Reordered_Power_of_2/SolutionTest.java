package com.zjxjwxk.leetcode._0869_Reordered_Power_of_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void reorderedPowerOf21() {
        int n = 1;
        assertTrue(solution.reorderedPowerOf2(n));
    }

    @Test
    void reorderedPowerOf22() {
        int n = 10;
        assertFalse(solution.reorderedPowerOf2(n));
    }

    @Test
    void reorderedPowerOf23() {
        int n = 16;
        assertTrue(solution.reorderedPowerOf2(n));
    }

    @Test
    void reorderedPowerOf24() {
        int n = 24;
        assertFalse(solution.reorderedPowerOf2(n));
    }

    @Test
    void reorderedPowerOf25() {
        int n = 46;
        assertTrue(solution.reorderedPowerOf2(n));
    }

    @Test
    void reorderedPowerOf26() {
        int n = 4960;
        assertTrue(solution.reorderedPowerOf2(n));
    }
}