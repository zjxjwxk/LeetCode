package com.zjxjwxk.leetcode._2300_Successful_Pairs_of_Spells_and_Potions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void successfulPairs() {
        int[] spells = {5, 1, 3}, potions = {1, 2, 3, 4, 5};
        int success = 7;
        int[] ans = {4, 0, 3};
        assertArrayEquals(ans, solution.successfulPairs(spells, potions, success));
    }

    @Test
    void successfulPairs2() {
        int[] spells = {3, 1, 2}, potions = {8, 5, 8};
        int success = 16;
        int[] ans = {2, 0, 2};
        assertArrayEquals(ans, solution.successfulPairs(spells, potions, success));
    }
}