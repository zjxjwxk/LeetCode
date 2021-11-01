package com.zjxjwxk.leetcode._0575_Distribute_Candies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void distributeCandies1() {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int ans = 3;
        assertEquals(ans, solution.distributeCandies(candyType));
    }

    @Test
    void distributeCandies2() {
        int[] candyType = {1, 1, 2, 3};
        int ans = 2;
        assertEquals(ans, solution.distributeCandies(candyType));
    }

    @Test
    void distributeCandies3() {
        int[] candyType = {6, 6, 6, 6};
        int ans = 1;
        assertEquals(ans, solution.distributeCandies(candyType));
    }
}