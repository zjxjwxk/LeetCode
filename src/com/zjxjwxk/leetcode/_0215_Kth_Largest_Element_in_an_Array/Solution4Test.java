package com.zjxjwxk.leetcode._0215_Kth_Largest_Element_in_an_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution4Test {

    private final Solution4 solution4 = new Solution4();

    @Test
    void findKthLargest1() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int ans = 5;
        assertEquals(ans, solution4.findKthLargest(nums, k));
    }

    @Test
    void findKthLargest2() {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        int ans = 4;
        assertEquals(ans, solution4.findKthLargest(nums, k));
    }

    @Test
    void findKthLargest3() {
        int[] nums = {7, 6, 5, 4, 3, 2, 1};
        int k = 2;
        int ans = 6;
        assertEquals(ans, solution4.findKthLargest(nums, k));
    }
}