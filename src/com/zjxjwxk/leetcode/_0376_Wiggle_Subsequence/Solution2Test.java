package com.zjxjwxk.leetcode._0376_Wiggle_Subsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void wiggleMaxLength1() {
        int[] nums = {1, 7, 4, 9, 2, 5};
        int ans = 6;
        assertEquals(ans, solution2.wiggleMaxLength(nums));
    }

    @Test
    void wiggleMaxLength2() {
        int[] nums = {1, 17, 5, 10, 13, 15, 10, 5, 16, 8};
        int ans = 7;
        assertEquals(ans, solution2.wiggleMaxLength(nums));
    }

    @Test
    void wiggleMaxLength3() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int ans = 2;
        assertEquals(ans, solution2.wiggleMaxLength(nums));
    }

    @Test
    void wiggleMaxLength4() {
        int[] nums = {0, 0};
        int ans = 1;
        assertEquals(ans, solution2.wiggleMaxLength(nums));
    }

    @Test
    void wiggleMaxLength5() {
        int[] nums = {0, 0, 2, -2};
        int ans = 3;
        assertEquals(ans, solution2.wiggleMaxLength(nums));
    }

    @Test
    void wiggleMaxLength6() {
        int[] nums = {};
        int ans = 0;
        assertEquals(ans, solution2.wiggleMaxLength(nums));
    }

    @Test
    void wiggleMaxLength7() {
        int[] nums = {1};
        int ans = 1;
        assertEquals(ans, solution2.wiggleMaxLength(nums));
    }
}