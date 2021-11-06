package com.zjxjwxk.leetcode._0268_Missing_Number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void missingNumber1() {
        int[] nums = {3, 0, 1};
        int ans = 2;
        assertEquals(ans, solution2.missingNumber(nums));
    }

    @Test
    void missingNumber2() {
        int[] nums = {0, 1};
        int ans = 2;
        assertEquals(ans, solution2.missingNumber(nums));
    }

    @Test
    void missingNumber3() {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int ans = 8;
        assertEquals(ans, solution2.missingNumber(nums));
    }

    @Test
    void missingNumber4() {
        int[] nums = {0};
        int ans = 1;
        assertEquals(ans, solution2.missingNumber(nums));
    }
}