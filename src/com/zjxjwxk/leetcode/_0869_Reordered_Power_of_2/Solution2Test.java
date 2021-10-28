package com.zjxjwxk.leetcode._0869_Reordered_Power_of_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void reorderedPowerOf21() {
        int n = 1;
        assertTrue(solution2.reorderedPowerOf2(n));
    }

    @Test
    void reorderedPowerOf22() {
        int n = 10;
        assertFalse(solution2.reorderedPowerOf2(n));
    }

    @Test
    void reorderedPowerOf23() {
        int n = 16;
        assertTrue(solution2.reorderedPowerOf2(n));
    }

    @Test
    void reorderedPowerOf24() {
        int n = 24;
        assertFalse(solution2.reorderedPowerOf2(n));
    }

    @Test
    void reorderedPowerOf25() {
        int n = 46;
        assertTrue(solution2.reorderedPowerOf2(n));
    }

    @Test
    void reorderedPowerOf26() {
        int n = 4960;
        assertTrue(solution2.reorderedPowerOf2(n));
    }
}