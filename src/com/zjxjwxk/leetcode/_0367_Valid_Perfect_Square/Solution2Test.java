package com.zjxjwxk.leetcode._0367_Valid_Perfect_Square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void isPerfectSquare1() {
        int num = 16;
        assertTrue(solution2.isPerfectSquare(num));
    }

    @Test
    void isPerfectSquare2() {
        int num = 14;
        assertFalse(solution2.isPerfectSquare(num));
    }

    @Test
    void isPerfectSquare3() {
        int num = 2147483647;
        assertFalse(solution2.isPerfectSquare(num));
    }
}