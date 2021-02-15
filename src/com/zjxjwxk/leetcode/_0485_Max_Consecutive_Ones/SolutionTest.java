package com.zjxjwxk.leetcode._0485_Max_Consecutive_Ones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findMaxConsecutiveOnes() {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int ans = 3;
        assertEquals(ans, solution.findMaxConsecutiveOnes(nums));
    }
}