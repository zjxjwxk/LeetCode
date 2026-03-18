package com.zjxjwxk.leetcode._1470_Shuffle_the_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void shuffle() {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] ans = {2, 3, 5, 4, 1, 7};
        assertArrayEquals(ans, solution2.shuffle(nums, n));
    }

    @Test
    void shuffle2() {
        int[] nums = {1, 2, 3, 4, 4, 3, 2, 1};
        int n = 4;
        int[] ans = {1, 4, 2, 3, 3, 2, 4, 1};
        assertArrayEquals(ans, solution2.shuffle(nums, n));
    }

    @Test
    void shuffle3() {
        int[] nums = {1, 1, 2, 2};
        int n = 2;
        int[] ans = {1, 2, 1, 2};
        assertArrayEquals(ans, solution2.shuffle(nums, n));
    }
}