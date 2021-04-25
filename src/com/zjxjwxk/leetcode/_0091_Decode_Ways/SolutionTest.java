package com.zjxjwxk.leetcode._0091_Decode_Ways;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numDecodings1() {
        String s = "12";
        int ans = 2;
        assertEquals(ans, solution.numDecodings(s));
    }

    @Test
    void numDecodings2() {
        String s = "226";
        int ans = 3;
        assertEquals(ans, solution.numDecodings(s));
    }

    @Test
    void numDecodings3() {
        String s = "0";
        int ans = 0;
        assertEquals(ans, solution.numDecodings(s));
    }

    @Test
    void numDecodings4() {
        String s = "06";
        int ans = 0;
        assertEquals(ans, solution.numDecodings(s));
    }

    @Test
    void numDecodings5() {
        String s = "27";
        int ans = 1;
        assertEquals(ans, solution.numDecodings(s));
    }

    @Test
    void numDecodings6() {
        String s = "2611055971756562";
        int ans = 4;
        assertEquals(ans, solution.numDecodings(s));
    }
}