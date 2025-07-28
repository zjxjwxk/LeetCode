package com.zjxjwxk.leetcode._0078_Subsets;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void subsets() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {1, 2, 3}, {1, 2}, {1, 3}, {1}, {2, 3}, {2}, {3}, {}
        });
        assertEquals(ans, solution.subsets(nums));
    }

    @Test
    void subsets2() {
        int[] nums = {0};
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {0}, {}
        });
        assertEquals(ans, solution.subsets(nums));
    }
}