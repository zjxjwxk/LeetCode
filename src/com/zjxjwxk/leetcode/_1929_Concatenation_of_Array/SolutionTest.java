package com.zjxjwxk.leetcode._1929_Concatenation_of_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void getConcatenation() {
        int[] nums = {1, 2, 1};
        int[] ans = {1, 2, 1, 1, 2, 1};
        assertArrayEquals(ans, solution.getConcatenation(nums));
    }

    @Test
    void getConcatenation2() {
        int[] nums = {1, 3, 2, 1};
        int[] ans = {1, 3, 2, 1, 1, 3, 2, 1};
        assertArrayEquals(ans, solution.getConcatenation(nums));
    }
}