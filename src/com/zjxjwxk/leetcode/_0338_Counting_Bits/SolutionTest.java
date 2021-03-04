package com.zjxjwxk.leetcode._0338_Counting_Bits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countBits1() {
        int num = 2;
        int[] ans = {0, 1, 1};
        assertArrayEquals(ans, solution.countBits(num));
    }

    @Test
    void countBits2() {
        int num = 5;
        int[] ans = {0, 1, 1, 2, 1, 2};
        assertArrayEquals(ans, solution.countBits(num));
    }
}