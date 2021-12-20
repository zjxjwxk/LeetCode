package com.zjxjwxk.leetcode._0475_Heaters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void findRadius1() {
        int[] houses = {1, 2, 3};
        int[] heaters = {2};
        int ans = 1;
        assertEquals(ans, solution2.findRadius(houses, heaters));
    }

    @Test
    void findRadius2() {
        int[] houses = {1, 2, 3, 4};
        int[] heaters = {1, 4};
        int ans = 1;
        assertEquals(ans, solution2.findRadius(houses, heaters));
    }

    @Test
    void findRadius3() {
        int[] houses = {1, 5};
        int[] heaters = {2};
        int ans = 3;
        assertEquals(ans, solution2.findRadius(houses, heaters));
    }
}