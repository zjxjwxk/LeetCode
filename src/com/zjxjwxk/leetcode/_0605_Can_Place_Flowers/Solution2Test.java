package com.zjxjwxk.leetcode._0605_Can_Place_Flowers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void canPlaceFlowers1() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        assertTrue(solution2.canPlaceFlowers(flowerbed, n));
    }

    @Test
    void canPlaceFlowers2() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;
        assertFalse(solution2.canPlaceFlowers(flowerbed, n));
    }

    @Test
    void canPlaceFlowers3() {
        int[] flowerbed = {0, 1, 0};
        int n = 1;
        assertFalse(solution2.canPlaceFlowers(flowerbed, n));
    }

    @Test
    void canPlaceFlowers4() {
        int[] flowerbed = {0, 0, 1, 0, 0};
        int n = 1;
        assertTrue(solution2.canPlaceFlowers(flowerbed, n));
    }
}