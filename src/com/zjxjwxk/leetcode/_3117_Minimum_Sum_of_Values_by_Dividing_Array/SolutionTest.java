package com.zjxjwxk.leetcode._3117_Minimum_Sum_of_Values_by_Dividing_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minimumValueSum() {
        int[] nums = { 1, 4, 3, 3, 2 };
        int[] andValues = { 0, 3, 3, 2 };
        int ans = 12;
        assertEquals(ans, solution.minimumValueSum(nums, andValues));
    }

    @Test
    void minimumValueSum2() {
        int[] nums = { 2, 3, 5, 7, 7, 7, 5 };
        int[] andValues = { 0, 7, 5 };
        int ans = 17;
        assertEquals(ans, solution.minimumValueSum(nums, andValues));
    }

    @Test
    void minimumValueSum3() {
        int[] nums = { 1, 2, 3, 4 };
        int[] andValues = { 2 };
        int ans = -1;
        assertEquals(ans, solution.minimumValueSum(nums, andValues));
    }
}
