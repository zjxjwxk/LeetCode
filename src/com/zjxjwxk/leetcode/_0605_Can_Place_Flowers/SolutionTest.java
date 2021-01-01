package com.zjxjwxk.leetcode._0605_Can_Place_Flowers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void canPlaceFlowers1() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        assertTrue(solution.canPlaceFlowers(flowerbed, n));
    }

    @Test
    void canPlaceFlowers2() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;
        assertFalse(solution.canPlaceFlowers(flowerbed, n));
    }

    @Test
    void canPlaceFlowers3() {
        int[] flowerbed = {0, 1, 0};
        int n = 1;
        assertFalse(solution.canPlaceFlowers(flowerbed, n));
    }

    @Test
    void canPlaceFlowers4() {
        int[] flowerbed = {0, 0, 1, 0, 0};
        int n = 1;
        assertTrue(solution.canPlaceFlowers(flowerbed, n));
    }
}