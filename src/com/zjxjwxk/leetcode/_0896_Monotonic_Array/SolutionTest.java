package com.zjxjwxk.leetcode._0896_Monotonic_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isMonotonic1() {
        int[] A = {1, 2, 2, 3};
        assertTrue(solution.isMonotonic(A));
    }

    @Test
    void isMonotonic2() {
        int[] A = {6, 5, 4, 4};
        assertTrue(solution.isMonotonic(A));
    }
    @Test
    void isMonotonic3() {
        int[] A = {1, 3, 2};
        assertFalse(solution.isMonotonic(A));
    }

    @Test
    void isMonotonic4() {
        int[] A = {1, 2, 4, 5};
        assertTrue(solution.isMonotonic(A));
    }

    @Test
    void isMonotonic5() {
        int[] A = {1, 1, 1};
        assertTrue(solution.isMonotonic(A));
    }

}