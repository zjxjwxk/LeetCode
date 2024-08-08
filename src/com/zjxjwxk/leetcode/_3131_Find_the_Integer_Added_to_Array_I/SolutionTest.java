package com.zjxjwxk.leetcode._3131_Find_the_Integer_Added_to_Array_I;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void addedInteger() {
        int[] num1 = {2, 6, 4}, num2 = {9, 7, 5};
        int ans = 3;
        assertEquals(ans, solution.addedInteger(num1, num2));
    }

    @Test
    void addedInteger2() {
        int[] num1 = {10}, num2 = {5};
        int ans = -5;
        assertEquals(ans, solution.addedInteger(num1, num2));
    }

    @Test
    void addedInteger3() {
        int[] num1 = {1, 1, 1, 1}, num2 = {1, 1, 1, 1};
        int ans = 0;
        assertEquals(ans, solution.addedInteger(num1, num2));
    }
}