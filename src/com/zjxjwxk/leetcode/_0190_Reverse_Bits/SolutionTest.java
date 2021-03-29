package com.zjxjwxk.leetcode._0190_Reverse_Bits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void reverseBits1() {
        int n = 43261596;
        int ans = 964176192;
        assertEquals(ans, solution.reverseBits(n));
    }

    @Test
    void reverseBits2() {
        int n = -3;
        int ans = -1073741825;
        assertEquals(ans, solution.reverseBits(n));
    }
}