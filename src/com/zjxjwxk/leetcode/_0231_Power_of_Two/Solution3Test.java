package com.zjxjwxk.leetcode._0231_Power_of_Two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution3Test {

    private final Solution3 solution3 = new Solution3();

    @Test
    void isPowerOfTwo1() {
        int n = 1;
        assertTrue(solution3.isPowerOfTwo(n));
    }

    @Test
    void isPowerOfTwo2() {
        int n = 16;
        assertTrue(solution3.isPowerOfTwo(n));
    }

    @Test
    void isPowerOfTwo3() {
        int n = 3;
        assertFalse(solution3.isPowerOfTwo(n));
    }

    @Test
    void isPowerOfTwo4() {
        int n = 4;
        assertTrue(solution3.isPowerOfTwo(n));
    }

    @Test
    void isPowerOfTwo5() {
        int n = 5;
        assertFalse(solution3.isPowerOfTwo(n));
    }

    @Test
    void isPowerOfTwo6() {
        int n = -2;
        assertFalse(solution3.isPowerOfTwo(n));
    }

    @Test
    void isPowerOfTwo8() {
        int n = -2147483648;
        assertFalse(solution3.isPowerOfTwo(n));
    }

    @Test
    void isPowerOfTwo9() {
        int n = 2147483647;
        assertFalse(solution3.isPowerOfTwo(n));
    }
}