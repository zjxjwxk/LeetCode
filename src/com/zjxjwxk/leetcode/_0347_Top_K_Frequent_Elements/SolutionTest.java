package com.zjxjwxk.leetcode._0347_Top_K_Frequent_Elements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void topKFrequent() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] ans = {2, 1};
        assertArrayEquals(ans, solution.topKFrequent(nums, k));
    }

    @Test
    void topKFrequent2() {
        int[] nums = {1};
        int k = 1;
        int[] ans = {1};
        assertArrayEquals(ans, solution.topKFrequent(nums, k));
    }
}