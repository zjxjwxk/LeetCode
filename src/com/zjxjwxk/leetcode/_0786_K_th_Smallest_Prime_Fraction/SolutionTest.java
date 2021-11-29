package com.zjxjwxk.leetcode._0786_K_th_Smallest_Prime_Fraction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void kthSmallestPrimeFraction1() {
        int[] arr = {1, 2, 3, 5};
        int k = 3;
        int[] ans = {2, 5};
        assertArrayEquals(ans, solution.kthSmallestPrimeFraction(arr, k));
    }

    @Test
    void kthSmallestPrimeFraction2() {
        int[] arr = {1, 7};
        int k = 1;
        int[] ans = {1, 7};
        assertArrayEquals(ans, solution.kthSmallestPrimeFraction(arr, k));
    }

    @Test
    void kthSmallestPrimeFraction3() {
        int[] arr = {1, 13, 17, 59};
        int k = 6;
        int[] ans = {13, 17};
        assertArrayEquals(ans, solution.kthSmallestPrimeFraction(arr, k));
    }
}