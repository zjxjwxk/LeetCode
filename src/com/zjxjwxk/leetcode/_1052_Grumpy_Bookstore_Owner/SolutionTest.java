package com.zjxjwxk.leetcode._1052_Grumpy_Bookstore_Owner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxSatisfied1() {
        int[] customers = {1, 0, 1, 2, 1, 1, 7, 5};
        int[] grumpy = {0, 1, 0, 1, 0, 1, 0, 1};
        int X = 3;
        int ans = 16;
        assertEquals(ans, solution.maxSatisfied(customers, grumpy, X));
    }

    @Test
    void maxSatisfied2() {
        int[] customers = {1, 2, 3};
        int[] grumpy = {0, 1, 0};
        int X = 0;
        int ans = 4;
        assertEquals(ans, solution.maxSatisfied(customers, grumpy, X));
    }

    @Test
    void maxSatisfied3() {
        int[] customers = {4, 10, 10};
        int[] grumpy = {1, 1, 0};
        int X = 2;
        int ans = 24;
        assertEquals(ans, solution.maxSatisfied(customers, grumpy, X));
    }
}