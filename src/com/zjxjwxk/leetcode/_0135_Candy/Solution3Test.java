package com.zjxjwxk.leetcode._0135_Candy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution3Test {

    private final Solution3 solution3 = new Solution3();

    @Test
    void candy1() {
        int[] ratings = {1, 0, 2};
        int ans = 5;
        assertEquals(ans, solution3.candy(ratings));
    }

    @Test
    void candy2() {
        int[] ratings = {1, 2, 2};
        int ans = 4;
        assertEquals(ans, solution3.candy(ratings));
    }
}