package com.zjxjwxk.leetcode._0041_First_Missing_Positive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void firstMissingPositive1() {
        int[] nums = {1, 2, 0};
        int ans = 3;
        assertEquals(ans, solution2.firstMissingPositive(nums));
    }

    @Test
    void firstMissingPositive2() {
        int[] nums = {3, 4, -1, 1};
        int ans = 2;
        assertEquals(ans, solution2.firstMissingPositive(nums));
    }

    @Test
    void firstMissingPositive3() {
        int[] nums = {7, 8, 9, 11, 12};
        int ans = 1;
        assertEquals(ans, solution2.firstMissingPositive(nums));
    }
}