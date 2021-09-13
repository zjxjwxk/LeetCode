package com.zjxjwxk.leetcode._1646_Get_Maximum_in_Generated_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void getMaximumGenerated1() {
        int n = 7;
        int ans = 3;
        assertEquals(ans, solution.getMaximumGenerated(n));
    }

    @Test
    void getMaximumGenerated2() {
        int n = 2;
        int ans = 1;
        assertEquals(ans, solution.getMaximumGenerated(n));
    }

    @Test
    void getMaximumGenerated3() {
        int n = 3;
        int ans = 2;
        assertEquals(ans, solution.getMaximumGenerated(n));
    }
}