package com.zjxjwxk.leetcode._0034_Find_First_and_Last_Position_of_Element_in_Sorted_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void searchRange1() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] ans = {3, 4};
        assertArrayEquals(ans, solution2.searchRange(nums, target));
    }

    @Test
    void searchRange2() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] ans = {-1, -1};
        assertArrayEquals(ans, solution2.searchRange(nums, target));
    }

    @Test
    void searchRange3() {
        int[] nums = {};
        int target = 0;
        int[] ans = {-1, -1};
        assertArrayEquals(ans, solution2.searchRange(nums, target));
    }

    @Test
    void searchRange4() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 10;
        int[] ans = {5, 5};
        assertArrayEquals(ans, solution2.searchRange(nums, target));
    }
}