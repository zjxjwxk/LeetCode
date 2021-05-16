package com.zjxjwxk.leetcode._1734_Decode_XORed_Permutation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void decode1() {
        int[] encoded = {3, 1};
        int[] ans = {1, 2, 3};
        assertArrayEquals(ans, solution.decode(encoded));
    }

    @Test
    void decode2() {
        int[] encoded = {6, 5, 4, 6};
        int[] ans = {2, 4, 1, 5, 3};
        assertArrayEquals(ans, solution.decode(encoded));
    }
}