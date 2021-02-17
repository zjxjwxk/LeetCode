package com.zjxjwxk.leetcode._0561_Array_Partition_I;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void arrayPairSum1() {
        int[] nums = {1, 4, 3, 2};
        int ans = 4;
        assertEquals(ans, solution.arrayPairSum(nums));
    }

    @Test
    void arrayPairSum2() {
        int[] nums = {6, 2, 6, 5, 1, 2};
        int ans = 9;
        assertEquals(ans, solution.arrayPairSum(nums));
    }
}