package com.zjxjwxk.leetcode._0338_Counting_Bits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution4Test {

    private final Solution4 solution4 = new Solution4();

    @Test
    void countBits1() {
        int num = 2;
        int[] ans = {0, 1, 1};
        assertArrayEquals(ans, solution4.countBits(num));
    }

    @Test
    void countBits2() {
        int num = 5;
        int[] ans = {0, 1, 1, 2, 1, 2};
        assertArrayEquals(ans, solution4.countBits(num));
    }
}