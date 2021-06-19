package com.zjxjwxk.leetcode._0486_Predict_the_Winner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void predictTheWinner1() {
        int[] nums = {1, 5, 2};
        assertFalse(solution2.PredictTheWinner(nums));
    }

    @Test
    void predictTheWinner2() {
        int[] nums = {1, 5, 233, 7};
        assertTrue(solution2.PredictTheWinner(nums));
    }
}