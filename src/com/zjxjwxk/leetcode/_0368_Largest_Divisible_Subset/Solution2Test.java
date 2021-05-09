package com.zjxjwxk.leetcode._0368_Largest_Divisible_Subset;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void largestDivisibleSubset1() {
        int[] nums = {1, 2, 3};
        List<Integer> ans = Arrays.asList(2, 1);
        assertEquals(ans, solution2.largestDivisibleSubset(nums));
    }

    @Test
    void largestDivisibleSubset2() {
        int[] nums = {1, 2, 4, 8};
        List<Integer> ans = Arrays.asList(8, 4, 2, 1);
        assertEquals(ans, solution2.largestDivisibleSubset(nums));
    }

    @Test
    void largestDivisibleSubset3() {
        int[] nums = {3, 4, 16, 8};
        List<Integer> ans = Arrays.asList(16, 8, 4);
        assertEquals(ans, solution2.largestDivisibleSubset(nums));
    }

    @Test
    void largestDivisibleSubset4() {
        int[] nums = {1};
        List<Integer> ans = Collections.singletonList(1);
        assertEquals(ans, solution2.largestDivisibleSubset(nums));
    }

    @Test
    void largestDivisibleSubset5() {
        int[] nums = {4, 8, 10, 240};
        List<Integer> ans = Arrays.asList(240, 8, 4);
        assertEquals(ans, solution2.largestDivisibleSubset(nums));
    }
}