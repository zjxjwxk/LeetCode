package com.zjxjwxk.leetcode._1588_Sum_of_All_Odd_Length_Subarrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void sumOddLengthSubarrays1() {
        int[] arr = {1, 4, 2, 5, 3};
        int ans = 58;
        assertEquals(ans, solution2.sumOddLengthSubarrays(arr));
    }

    @Test
    void sumOddLengthSubarrays2() {
        int[] arr = {1, 2};
        int ans = 3;
        assertEquals(ans, solution2.sumOddLengthSubarrays(arr));
    }

    @Test
    void sumOddLengthSubarrays3() {
        int[] arr = {10, 11, 12};
        int ans = 66;
        assertEquals(ans, solution2.sumOddLengthSubarrays(arr));
    }
}