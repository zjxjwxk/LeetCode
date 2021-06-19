package com.zjxjwxk.leetcode._0486_Predict_the_Winner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void predictTheWinner1() {
        int[] nums = {1, 5, 2};
        assertFalse(solution.PredictTheWinner(nums));
    }

    @Test
    void predictTheWinner2() {
        int[] nums = {1, 5, 233, 7};
        assertTrue(solution.PredictTheWinner(nums));
    }
}