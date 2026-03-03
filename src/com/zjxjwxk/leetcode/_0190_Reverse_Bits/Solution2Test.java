package com.zjxjwxk.leetcode._0190_Reverse_Bits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void reverseBits1() {
        int n = 43261596;
        int ans = 964176192;
        assertEquals(ans, solution2.reverseBits(n));
    }

    @Test
    void reverseBits2() {
        int n = 2147483644;
        int ans = 1073741822;
        assertEquals(ans, solution2.reverseBits(n));
    }
}