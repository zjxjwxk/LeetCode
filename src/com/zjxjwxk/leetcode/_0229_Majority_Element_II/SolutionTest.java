package com.zjxjwxk.leetcode._0229_Majority_Element_II;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void majorityElement1() {
        int[] nums = {3, 2, 3};
        List<Integer> ans = Collections.singletonList(3);
        assertEquals(ans, solution.majorityElement(nums));
    }

    @Test
    void majorityElement2() {
        int[] nums = {1};
        List<Integer> ans = Collections.singletonList(1);
        assertEquals(ans, solution.majorityElement(nums));
    }

    @Test
    void majorityElement3() {
        int[] nums = {1, 1, 1, 3, 3, 2, 2, 2};
        List<Integer> ans = Arrays.asList(1, 2);
        assertEquals(ans, solution.majorityElement(nums));
    }
}