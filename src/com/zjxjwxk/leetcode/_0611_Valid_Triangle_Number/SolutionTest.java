package com.zjxjwxk.leetcode._0611_Valid_Triangle_Number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void triangleNumber1() {
        int[] nums = {2, 2, 3, 4};
        int ans = 3;
        assertEquals(ans, solution.triangleNumber(nums));
    }

    @Test
    void triangleNumber2() {
        int[] nums = {48, 66, 61, 46, 94, 75};
        int ans = 19;
        assertEquals(ans, solution.triangleNumber(nums));
    }
}