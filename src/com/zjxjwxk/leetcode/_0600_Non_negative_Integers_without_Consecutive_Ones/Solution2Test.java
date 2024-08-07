package com.zjxjwxk.leetcode._0600_Non_negative_Integers_without_Consecutive_Ones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void findIntegers() {
        int n = 5;
        int ans = 5;
        assertEquals(ans, solution2.findIntegers(n));
    }

    @Test
    void findIntegers2() {
        int n = 1;
        int ans = 2;
        assertEquals(ans, solution2.findIntegers(n));
    }

    @Test
    void findIntegers3() {
        int n = 2;
        int ans = 3;
        assertEquals(ans, solution2.findIntegers(n));
    }

    @Test
    void findIntegers4() {
        int n = 4;
        int ans = 4;
        assertEquals(ans, solution2.findIntegers(n));
    }

    @Test
    void findIntegers5() {
        int n = 6;
        int ans = 5;
        assertEquals(ans, solution2.findIntegers(n));
    }
}