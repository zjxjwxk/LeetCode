package com.zjxjwxk.leetcode._0047_Permutations_II;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void permuteUnique1() {
        int[] nums = {1, 1, 2};
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {1, 1, 2},
                {1, 2, 1},
                {2, 1, 1}
        });
        assertEquals(ans, solution.permuteUnique(nums));
    }

    @Test
    void permuteUnique2() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, {3, 2, 1}
        });
        assertEquals(ans, solution.permuteUnique(nums));
    }
}