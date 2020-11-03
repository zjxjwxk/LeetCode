package com.zjxjwxk.leetcode._0941_Valid_Mountain_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void validMountainArray() {
        int[] A = {1, 2};
        assertFalse(solution.validMountainArray(A));
        A = new int[]{3, 5, 5};
        assertFalse(solution.validMountainArray(A));
        A = new int[]{0, 3, 2, 1};
        assertTrue(solution.validMountainArray(A));
    }
}