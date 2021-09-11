package com.zjxjwxk.leetcode._0526_Beautiful_Arrangement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void countArrangement1() {
        int n = 2;
        int ans = 2;
        assertEquals(ans, solution2.countArrangement(n));
    }

    @Test
    void countArrangement2() {
        int n = 1;
        int ans = 1;
        assertEquals(ans, solution2.countArrangement(n));
    }

    @Test
    void countArrangement3() {
        int n = 3;
        int ans = 3;
        assertEquals(ans, solution2.countArrangement(n));
    }
}