package com.zjxjwxk.leetcode._0477_Total_Hamming_Distance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void totalHammingDistance() {
        int[] nums = {4, 14, 2};
        int ans = 6;
        assertEquals(ans, solution.totalHammingDistance(nums));
    }
}