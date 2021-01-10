package com.zjxjwxk.leetcode._0228_Summary_Ranges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void summaryRanges1() {
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> ans = Arrays.asList("0->2", "4->5", "7");
        assertEquals(ans, solution.summaryRanges(nums));
    }

    @Test
    void summaryRanges2() {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};
        List<String> ans = Arrays.asList("0", "2->4", "6", "8->9");
        assertEquals(ans, solution.summaryRanges(nums));
    }

    @Test
    void summaryRanges3() {
        int[] nums = {};
        List<String> ans = new ArrayList<>();
        assertEquals(ans, solution.summaryRanges(nums));
    }

    @Test
    void summaryRanges4() {
        int[] nums = {-1};
        List<String> ans = Collections.singletonList("-1");
        assertEquals(ans, solution.summaryRanges(nums));
    }

    @Test
    void summaryRanges5() {
        int[] nums = {0};
        List<String> ans = Collections.singletonList("0");
        assertEquals(ans, solution.summaryRanges(nums));
    }
}