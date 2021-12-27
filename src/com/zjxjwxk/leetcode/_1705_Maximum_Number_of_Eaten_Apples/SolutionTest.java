package com.zjxjwxk.leetcode._1705_Maximum_Number_of_Eaten_Apples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void eatenApples1() {
        int[] apples = {1, 2, 3, 5, 2};
        int[] days = {3, 2, 1, 4, 2};
        int ans = 7;
        assertEquals(ans, solution.eatenApples(apples, days));
    }

    @Test
    void eatenApples2() {
        int[] apples = {3, 0, 0, 0, 0, 2};
        int[] days = {3, 0, 0, 0, 0, 2};
        int ans = 5;
        assertEquals(ans, solution.eatenApples(apples, days));
    }

    @Test
    void eatenApples3() {
        int[] apples = {2, 1, 10};
        int[] days = {2, 10, 1};
        int ans = 4;
        assertEquals(ans, solution.eatenApples(apples, days));
    }
}