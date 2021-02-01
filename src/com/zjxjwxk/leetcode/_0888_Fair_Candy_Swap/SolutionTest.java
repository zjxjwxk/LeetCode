package com.zjxjwxk.leetcode._0888_Fair_Candy_Swap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void fairCandySwap1() {
        int[] A = {1, 1}, B = {2, 2};
        int[] ans = {1, 2};
        assertArrayEquals(ans, solution.fairCandySwap(A, B));
    }

    @Test
    void fairCandySwap2() {
        int[] A = {1, 2}, B = {2, 3};
        int[] ans = {1, 2};
        assertArrayEquals(ans, solution.fairCandySwap(A, B));
    }

    @Test
    void fairCandySwap3() {
        int[] A = {2}, B = {1, 3};
        int[] ans = {2, 3};
        assertArrayEquals(ans, solution.fairCandySwap(A, B));
    }

    @Test
    void fairCandySwap4() {
        int[] A = {1, 2, 5}, B = {2, 4};
        int[] ans = {5, 4};
        assertArrayEquals(ans, solution.fairCandySwap(A, B));
    }
}