package com.zjxjwxk.leetcode._0201_Bitwise_AND_of_Numbers_Range;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void rangeBitwiseAnd() {
        int left = 5, right = 7;
        int ans = 4;
        assertEquals(ans, solution.rangeBitwiseAnd(left, right));
    }

    @Test
    void rangeBitwiseAnd2() {
        int left = 0, right = 0;
        int ans = 0;
        assertEquals(ans, solution.rangeBitwiseAnd(left, right));
    }

    @Test
    void rangeBitwiseAnd3() {
        int left = 1, right = 2147483647;
        int ans = 0;
        assertEquals(ans, solution.rangeBitwiseAnd(left, right));
    }
}