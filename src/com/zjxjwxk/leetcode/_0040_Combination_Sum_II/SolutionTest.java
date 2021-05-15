package com.zjxjwxk.leetcode._0040_Combination_Sum_II;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void combinationSum1() {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {1, 1, 6},
                {1, 2, 5},
                {1, 7},
                {2, 6}
        });
        assertEquals(ans, solution.combinationSum2(candidates, target));
    }

    @Test
    void combinationSum2() {
        int[] candidates = {2, 5, 2, 1, 2};
        int target = 5;
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {1, 2, 2},
                {5}
        });
        assertEquals(ans, solution.combinationSum2(candidates, target));
    }
}