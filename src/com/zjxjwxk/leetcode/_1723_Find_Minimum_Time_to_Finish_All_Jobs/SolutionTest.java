package com.zjxjwxk.leetcode._1723_Find_Minimum_Time_to_Finish_All_Jobs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minimumTimeRequired1() {
        int[] jobs = {3, 2, 3};
        int k = 3;
        int ans = 3;
        assertEquals(ans, solution.minimumTimeRequired(jobs, k));
    }

    @Test
    void minimumTimeRequired2() {
        int[] jobs = {1, 2, 4, 7, 8};
        int k = 2;
        int ans = 11;
        assertEquals(ans, solution.minimumTimeRequired(jobs, k));
    }

    @Test
    void minimumTimeRequired3() {
        int[] jobs = {5129437, 1842905, 2200851, 597069, 8618690, 5823974, 3199380, 2416829, 7138804, 2445093, 7207875, 7133141};
        int k = 3;
        int ans = 17952682;
        assertEquals(ans, solution.minimumTimeRequired(jobs, k));
    }
}