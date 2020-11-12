package com.zjxjwxk.leetcode._0922_Sort_Array_By_Parity_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sortArrayByParityII() {
        int[] A = {4, 2, 5, 7};
        int[] ans = {4, 5, 2, 7};
        int[
                ] result = solution.sortArrayByParityII(A);
        assertArrayEquals(ans, result);
    }
}