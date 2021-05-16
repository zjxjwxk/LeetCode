package com.zjxjwxk.leetcode._0216_Combination_Sum_III;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void combinationSum1() {
        int k = 3;
        int n = 7;
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {1, 2, 4}
        });
        assertEquals(ans, solution.combinationSum3(k, n));
    }

    @Test
    void combinationSum2() {
        int k = 3;
        int n = 9;
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {1, 2, 6},
                {1, 3, 5},
                {2, 3, 4}
        });
        assertEquals(ans, solution.combinationSum3(k, n));
    }
}