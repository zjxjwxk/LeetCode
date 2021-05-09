package com.zjxjwxk.leetcode._0403_Frog_Jump;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution3Test {

    private final Solution3 solution3 = new Solution3();

    @Test
    void canCross1() {
        int[] stones = {0, 1, 3, 5, 6, 8, 12, 17};
        assertTrue(solution3.canCross(stones));
    }

    @Test
    void canCross2() {
        int[] stones = {0, 1, 2, 3, 4, 8, 9, 11};
        assertFalse(solution3.canCross(stones));
    }

    @Test
    void canCross3() {
        int[] stones = {0, 1, 3, 6, 7};
        assertFalse(solution3.canCross(stones));
    }

    @Test
    void canCross4() {
        int[] stones = {0, 2};
        assertFalse(solution3.canCross(stones));
    }

    @Test
    void canCross5() {
        int[] stones = {0, 1, 3, 6, 10, 15, 16, 21};
        assertTrue(solution3.canCross(stones));
    }

    @Test
    void canCross6() {
        int[] stones = {0, 1, 2, 5, 6, 9, 10, 12, 13, 14, 17, 19, 20, 21, 26, 27, 28, 29, 30};
        assertFalse(solution3.canCross(stones));
    }
}