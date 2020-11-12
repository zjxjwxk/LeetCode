package com.zjxjwxk.leetcode._0905_Sort_Array_By_Parity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sortArrayByParity1() {
        int[] A = {3, 1, 2, 4};
        int[] ans = {4, 2, 1, 3};
        int[] result = solution.sortArrayByParity(A);
        assertArrayEquals(ans, result);
    }

    @Test
    void sortArrayByParity2() {
        int[] A = {2, 4, 6, 8};
        int[] ans = {2, 4, 6, 8};
        int[] result = solution.sortArrayByParity(A);
        assertArrayEquals(ans, result);
    }

    @Test
    void sortArrayByParity3() {
        int[] A = {1, 3, 5, 7};
        int[] ans = {1, 3, 5, 7};
        int[] result = solution.sortArrayByParity(A);
        assertArrayEquals(ans, result);
    }

    @Test
    void sortArrayByParity4() {
        int[] A = {1};
        int[] ans = {1};
        int[] result = solution.sortArrayByParity(A);
        assertArrayEquals(ans, result);
    }
}