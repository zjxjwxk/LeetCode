package com.zjxjwxk.leetcode._1486_XOR_Operation_in_an_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void xorOperation1() {
        int n = 5, start = 0;
        int ans = 8;
        assertEquals(ans, solution.xorOperation(n, start));
    }

    @Test
    void xorOperation2() {
        int n = 4, start = 3;
        int ans = 8;
        assertEquals(ans, solution.xorOperation(n, start));
    }

    @Test
    void xorOperation3() {
        int n = 1, start = 7;
        int ans = 7;
        assertEquals(ans, solution.xorOperation(n, start));
    }

    @Test
    void xorOperation4() {
        int n = 10, start = 5;
        int ans = 2;
        assertEquals(ans, solution.xorOperation(n, start));
    }
}