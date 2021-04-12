package com.zjxjwxk.leetcode._0179_Largest_Number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void largestNumber1() {
        int[] nums = {10, 2};
        String ans = "210";
        assertEquals(ans, solution.largestNumber(nums));
    }

    @Test
    void largestNumber2() {
        int[] nums = {3, 30, 34, 5, 9};
        String ans = "9534330";
        assertEquals(ans, solution.largestNumber(nums));
    }

    @Test
    void largestNumber3() {
        int[] nums = {1};
        String ans = "1";
        assertEquals(ans, solution.largestNumber(nums));
    }

    @Test
    void largestNumber4() {
        int[] nums = {10};
        String ans = "10";
        assertEquals(ans, solution.largestNumber(nums));
    }

    @Test
    void largestNumber5() {
        int[] nums = {0, 0};
        String ans = "0";
        assertEquals(ans, solution.largestNumber(nums));
    }
}