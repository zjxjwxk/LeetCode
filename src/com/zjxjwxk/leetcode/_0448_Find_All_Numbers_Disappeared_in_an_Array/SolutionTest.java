package com.zjxjwxk.leetcode._0448_Find_All_Numbers_Disappeared_in_an_Array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findDisappearedNumbers1() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> ans = Arrays.asList(5, 6);
        assertEquals(ans, solution.findDisappearedNumbers(nums));
    }

    @Test
    void findDisappearedNumbers2() {
        int[] nums = {1};
        List<Integer> ans = new ArrayList<>();
        assertEquals(ans, solution.findDisappearedNumbers(nums));
    }
}