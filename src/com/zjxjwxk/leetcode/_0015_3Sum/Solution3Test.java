package com.zjxjwxk.leetcode._0015_3Sum;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution3Test {

    private final Solution3 solution3 = new Solution3();

    @Test
    void threeSum1() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {-1, -1, 2}, {-1, 0, 1}
        });
        assertEquals(ans, solution3.threeSum(nums));
    }

    @Test
    void threeSum2() {
        int[] nums = {};
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{});
        assertEquals(ans, solution3.threeSum(nums));
    }

    @Test
    void threeSum3() {
        int[] nums = {0};
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{});
        assertEquals(ans, solution3.threeSum(nums));
    }
}