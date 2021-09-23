package com.zjxjwxk.leetcode._0326_Power_of_Three;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void isPowerOfThree1() {
        int n = 27;
        assertTrue(solution2.isPowerOfThree(n));
    }

    @Test
    void isPowerOfThree2() {
        int n = 0;
        assertFalse(solution2.isPowerOfThree(n));
    }

    @Test
    void isPowerOfThree3() {
        int n = 9;
        assertTrue(solution2.isPowerOfThree(n));
    }

    @Test
    void isPowerOfThree4() {
        int n = 45;
        assertFalse(solution2.isPowerOfThree(n));
    }
}