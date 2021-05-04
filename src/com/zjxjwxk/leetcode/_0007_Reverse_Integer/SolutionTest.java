package com.zjxjwxk.leetcode._0007_Reverse_Integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void reverse1() {
        int x = 123;
        int ans = 321;
        assertEquals(ans, solution.reverse(x));
    }

    @Test
    void reverse2() {
        int x = -123;
        int ans = -321;
        assertEquals(ans, solution.reverse(x));
    }

    @Test
    void reverse3() {
        int x = 120;
        int ans = 21;
        assertEquals(ans, solution.reverse(x));
    }

    @Test
    void reverse4() {
        int x = 0;
        int ans = 0;
        assertEquals(ans, solution.reverse(x));
    }
}