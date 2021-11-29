package com.zjxjwxk.leetcode._0786_K_th_Smallest_Prime_Fraction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution3Test {

    private final Solution3 solution3 = new Solution3();

    @Test
    void kthSmallestPrimeFraction1() {
        int[] arr = {1, 2, 3, 5};
        int k = 3;
        int[] ans = {2, 5};
        assertArrayEquals(ans, solution3.kthSmallestPrimeFraction(arr, k));
    }

    @Test
    void kthSmallestPrimeFraction2() {
        int[] arr = {1, 7};
        int k = 1;
        int[] ans = {1, 7};
        assertArrayEquals(ans, solution3.kthSmallestPrimeFraction(arr, k));
    }

    @Test
    void kthSmallestPrimeFraction3() {
        int[] arr = {1, 13, 17, 59};
        int k = 6;
        int[] ans = {13, 17};
        assertArrayEquals(ans, solution3.kthSmallestPrimeFraction(arr, k));
    }

    @Test
    void kthSmallestPrimeFraction4() {
        int[] arr = {1, 29, 47};
        int k = 1;
        int[] ans = {1, 47};
        assertArrayEquals(ans, solution3.kthSmallestPrimeFraction(arr, k));
    }
}