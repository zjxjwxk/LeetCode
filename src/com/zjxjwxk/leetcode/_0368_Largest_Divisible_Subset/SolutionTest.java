package com.zjxjwxk.leetcode._0368_Largest_Divisible_Subset;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void largestDivisibleSubset1() {
        int[] nums = {1, 2, 3};
        List<Integer> ans = Arrays.asList(1, 2);
        assertEquals(ans, solution.largestDivisibleSubset(nums));
    }

    @Test
    void largestDivisibleSubset2() {
        int[] nums = {1, 2, 4, 8};
        List<Integer> ans = Arrays.asList(1, 2, 4, 8);
        assertEquals(ans, solution.largestDivisibleSubset(nums));
    }

    @Test
    void largestDivisibleSubset3() {
        int[] nums = {3, 4, 16, 8};
        List<Integer> ans = Arrays.asList(4, 8, 16);
        assertEquals(ans, solution.largestDivisibleSubset(nums));
    }

    @Test
    void largestDivisibleSubset4() {
        int[] nums = {1};
        List<Integer> ans = Collections.singletonList(1);
        assertEquals(ans, solution.largestDivisibleSubset(nums));
    }
}