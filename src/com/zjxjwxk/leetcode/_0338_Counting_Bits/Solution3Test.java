package com.zjxjwxk.leetcode._0338_Counting_Bits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution3Test {

    private final Solution3 solution3 = new Solution3();

    @Test
    void countBits1() {
        int num = 2;
        int[] ans = {0, 1, 1};
        assertArrayEquals(ans, solution3.countBits(num));
    }

    @Test
    void countBits2() {
        int num = 5;
        int[] ans = {0, 1, 1, 2, 1, 2};
        assertArrayEquals(ans, solution3.countBits(num));
    }
}