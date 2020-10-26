package com.zjxjwxk.leetcode._1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void smallerNumbersThanCurrent1() {
        int[] nums = {8, 1, 2, 2, 3};
        int[] ans = {4, 0, 1, 1, 3};
        assertArrayEquals(ans, solution.smallerNumbersThanCurrent(nums));
    }

    @Test
    void smallerNumbersThanCurrent2() {
        int[] nums = {6, 5, 4, 8};
        int[] ans = {2, 1, 0, 3};
        assertArrayEquals(ans, solution.smallerNumbersThanCurrent(nums));
    }

    @Test
    void smallerNumbersThanCurrent3() {
        int[] nums = {7, 7, 7, 7};
        int[] ans = {0, 0, 0, 0};
        assertArrayEquals(ans, solution.smallerNumbersThanCurrent(nums));
    }
}