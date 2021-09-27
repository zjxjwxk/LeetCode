package com.zjxjwxk.leetcode._0639_Decode_Ways_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numDecodings1() {
        String s = "*";
        int ans = 9;
        assertEquals(ans, solution.numDecodings(s));
    }

    @Test
    void numDecodings2() {
        String s = "1*";
        int ans = 18;
        assertEquals(ans, solution.numDecodings(s));
    }

    @Test
    void numDecodings3() {
        String s = "2*";
        int ans = 15;
        assertEquals(ans, solution.numDecodings(s));
    }

    @Test
    void numDecodings4() {
        String s = "**";
        int ans = 96;
        assertEquals(ans, solution.numDecodings(s));
    }
}