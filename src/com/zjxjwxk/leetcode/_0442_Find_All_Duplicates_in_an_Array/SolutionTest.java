package com.zjxjwxk.leetcode._0442_Find_All_Duplicates_in_an_Array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findDuplicates() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> ans = Arrays.asList(3, 2);
        assertEquals(ans, solution.findDuplicates(nums));
    }

    @Test
    void findDuplicates2() {
        int[] nums = {1, 1, 2};
        List<Integer> ans = Collections.singletonList(1);
        assertEquals(ans, solution.findDuplicates(nums));
    }

    @Test
    void findDuplicates3() {
        int[] nums = {1};
        List<Integer> ans = new ArrayList<>();
        assertEquals(ans, solution.findDuplicates(nums));
    }
}