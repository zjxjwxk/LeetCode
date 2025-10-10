package com.zjxjwxk.leetcode._3147_Taking_Maximum_Energy_From_the_Mystic_Dungeon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maximumEnergy() {
        int[] energy = {5, 2, -10, -5, 1};
        int k = 3;
        int ans = 3;
        assertEquals(ans, solution.maximumEnergy(energy, k));
    }

    @Test
    void maximumEnergy2() {
        int[] energy = {-2, -3, -1};
        int k = 2;
        int ans = -1;
        assertEquals(ans, solution.maximumEnergy(energy, k));
    }
}