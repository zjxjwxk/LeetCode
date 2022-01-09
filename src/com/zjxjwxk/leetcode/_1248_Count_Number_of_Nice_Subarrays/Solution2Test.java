package com.zjxjwxk.leetcode._1248_Count_Number_of_Nice_Subarrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void numberOfSubarrays1() {
        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;
        int ans = 2;
        assertEquals(ans, solution2.numberOfSubarrays(nums, k));
    }

    @Test
    void numberOfSubarrays2() {
        int[] nums = {2, 4, 6};
        int k = 1;
        int ans = 0;
        assertEquals(ans, solution2.numberOfSubarrays(nums, k));
    }

    @Test
    void numberOfSubarrays3() {
        int[] nums = {2, 2, 2, 1, 2, 2, 1, 2, 2, 2};
        int k = 2;
        int ans = 16;
        assertEquals(ans, solution2.numberOfSubarrays(nums, k));
    }

    @Test
    void numberOfSubarrays4() {
        int[] nums = {1, 1, 1, 1, 1};
        int k = 1;
        int ans = 5;
        assertEquals(ans, solution2.numberOfSubarrays(nums, k));
    }
}