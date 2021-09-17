package com.zjxjwxk.leetcode._1588_Sum_of_All_Odd_Length_Subarrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sumOddLengthSubarrays1() {
        int[] arr = {1, 4, 2, 5, 3};
        int ans = 58;
        assertEquals(ans, solution.sumOddLengthSubarrays(arr));
    }

    @Test
    void sumOddLengthSubarrays2() {
        int[] arr = {1, 2};
        int ans = 3;
        assertEquals(ans, solution.sumOddLengthSubarrays(arr));
    }

    @Test
    void sumOddLengthSubarrays3() {
        int[] arr = {10, 11, 12};
        int ans = 66;
        assertEquals(ans, solution.sumOddLengthSubarrays(arr));
    }
}