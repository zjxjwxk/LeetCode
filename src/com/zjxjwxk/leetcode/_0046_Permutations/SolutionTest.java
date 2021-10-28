package com.zjxjwxk.leetcode._0046_Permutations;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void permute1() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 2, 1}, {3, 1, 2}
        });
        assertEquals(ans, solution.permute(nums));
    }

    @Test
    void permute2() {
        int[] nums = {0, 1};
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {0, 1}, {1, 0}
        });
        assertEquals(ans, solution.permute(nums));
    }

    @Test
    void permute3() {
        int[] nums = {1};
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {1}
        });
        assertEquals(ans, solution.permute(nums));
    }
}