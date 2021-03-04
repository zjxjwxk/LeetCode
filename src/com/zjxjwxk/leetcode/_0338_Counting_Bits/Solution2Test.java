package com.zjxjwxk.leetcode._0338_Counting_Bits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void countBits1() {
        int num = 2;
        int[] ans = {0, 1, 1};
        assertArrayEquals(ans, solution2.countBits(num));
    }

    @Test
    void countBits2() {
        int num = 5;
        int[] ans = {0, 1, 1, 2, 1, 2};
        assertArrayEquals(ans, solution2.countBits(num));
    }
}