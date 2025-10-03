package com.zjxjwxk.leetcode._0090_Subsets_II;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void subsetsWithDup1() {
        int[] nums = {1, 2, 2};
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {1, 2, 2}, {1, 2}, {1}, {2, 2}, {2}, {}
        });
        assertEquals(ans, solution.subsetsWithDup(nums));
    }

    @Test
    void subsetsWithDup2() {
        int[] nums = {0};
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {0}, {}
        });
        assertEquals(ans, solution.subsetsWithDup(nums));
    }

    @Test
    void subsetsWithDup3() {
        int[] nums = {1, 1, 2, 2};
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {1, 1, 2, 2}, {1, 1, 2}, {1, 1}, {1, 2, 2}, {1, 2}, {1}, {2, 2}, {2}, {}
        });
        assertEquals(ans, solution.subsetsWithDup(nums));
    }
}