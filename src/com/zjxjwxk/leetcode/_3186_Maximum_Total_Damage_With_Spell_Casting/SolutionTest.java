package com.zjxjwxk.leetcode._3186_Maximum_Total_Damage_With_Spell_Casting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maximumTotalDamage() {
        int[] power = {1, 1, 3, 4};
        int ans = 6;
        assertEquals(ans, solution.maximumTotalDamage(power));
    }

    @Test
    void maximumTotalDamage2() {
        int[] power = {7, 1, 6, 6};
        int ans = 13;
        assertEquals(ans, solution.maximumTotalDamage(power));
    }
}