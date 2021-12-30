package com.zjxjwxk.leetcode._0846_Hand_of_Straights;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isNStraightHand1() {
        int[] hand = {1, 2, 3, 6, 2, 3, 4, 7, 8};
        int groupSize = 3;
        assertTrue(solution.isNStraightHand(hand, groupSize));
    }

    @Test
    void isNStraightHand2() {
        int[] hand = {1, 2, 3, 4, 5};
        int groupSize = 4;
        assertFalse(solution.isNStraightHand(hand, groupSize));
    }

    @Test
    void isNStraightHand3() {
        int[] hand = {1, 1, 2, 2, 3, 3};
        int groupSize = 3;
        assertTrue(solution.isNStraightHand(hand, groupSize));
    }
}