package com.zjxjwxk.leetcode._0643_Maximum_Average_Subarray_I;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findMaxAverage() {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double ans = 12.75;
        assertEquals(ans, solution.findMaxAverage(nums, k));
    }
}