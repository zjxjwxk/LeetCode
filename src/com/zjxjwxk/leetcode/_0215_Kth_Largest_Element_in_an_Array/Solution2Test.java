package com.zjxjwxk.leetcode._0215_Kth_Largest_Element_in_an_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void findKthLargest1() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int ans = 5;
        assertEquals(ans, solution2.findKthLargest(nums, k));
    }

    @Test
    void findKthLargest2() {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        int ans = 4;
        assertEquals(ans, solution2.findKthLargest(nums, k));
    }
}