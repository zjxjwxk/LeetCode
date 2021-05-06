package com.zjxjwxk.leetcode._1720_Decode_XORed_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void decode1() {
        int[] encoded = {1, 2, 3};
        int first = 1;
        int[] ans = {1, 0, 2, 1};
        assertArrayEquals(ans, solution.decode(encoded, first));
    }

    @Test
    void decode2() {
        int[] encoded = {6, 2, 7, 3};
        int first = 4;
        int[] ans = {4, 2, 0, 7, 4};
        assertArrayEquals(ans, solution.decode(encoded, first));
    }
}