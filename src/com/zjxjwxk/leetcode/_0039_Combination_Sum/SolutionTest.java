package com.zjxjwxk.leetcode._0039_Combination_Sum;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void combinationSum1() {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {2, 2, 3},
                {7}
        });
        assertEquals(ans, solution.combinationSum(candidates, target));
    }

    @Test
    void combinationSum2() {
        int[] candidates = {2, 3, 5};
        int target = 8;
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {2, 2, 2, 2},
                {2, 3, 3},
                {3, 5}
        });
        assertEquals(ans, solution.combinationSum(candidates, target));
    }
}