package com.zjxjwxk.leetcode._0781_Rabbits_in_Forest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution solution = new Solution();

    @Test
    void numRabbits1() {
        int[] answers = {1, 1, 2};
        int ans = 5;
        assertEquals(ans, solution.numRabbits(answers));
    }

    @Test
    void numRabbits2() {
        int[] answers = {10, 10, 10};
        int ans = 11;
        assertEquals(ans, solution.numRabbits(answers));
    }

    @Test
    void numRabbits3() {
        int[] answers = {};
        int ans = 0;
        assertEquals(ans, solution.numRabbits(answers));
    }
}