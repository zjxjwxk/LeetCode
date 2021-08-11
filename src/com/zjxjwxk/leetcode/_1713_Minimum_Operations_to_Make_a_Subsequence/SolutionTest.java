package com.zjxjwxk.leetcode._1713_Minimum_Operations_to_Make_a_Subsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minOperations1() {
        int[] target = {5, 1, 3};
        int[] arr = {9, 4, 2, 3, 4};
        int ans = 2;
        assertEquals(ans, solution.minOperations(target, arr));
    }

    @Test
    void minOperations2() {
        int[] target = {6, 4, 8, 1, 3, 2};
        int[] arr = {4, 7, 6, 2, 3, 8, 6, 1};
        int ans = 3;
        assertEquals(ans, solution.minOperations(target, arr));
    }

    @Test
    void minOperations3() {
        int[] target = {1, 3, 8};
        int[] arr = {2, 6};
        int ans = 3;
        assertEquals(ans, solution.minOperations(target, arr));
    }

    @Test
    void minOperations4() {
        int[] target = {16, 7, 20, 11, 15, 13, 10, 14, 6, 8};
        int[] arr = {11, 14, 15, 7, 5, 5, 6, 10, 11, 6};
        int ans = 6;
        assertEquals(ans, solution.minOperations(target, arr));
    }
}