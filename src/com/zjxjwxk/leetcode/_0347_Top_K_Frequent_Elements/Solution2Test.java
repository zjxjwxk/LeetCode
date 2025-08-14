package com.zjxjwxk.leetcode._0347_Top_K_Frequent_Elements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void topKFrequent() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] ans = {1, 2};
        assertArrayEquals(ans, solution2.topKFrequent(nums, k));
    }

    @Test
    void topKFrequent2() {
        int[] nums = {1};
        int k = 1;
        int[] ans = {1};
        assertArrayEquals(ans, solution2.topKFrequent(nums, k));
    }
}