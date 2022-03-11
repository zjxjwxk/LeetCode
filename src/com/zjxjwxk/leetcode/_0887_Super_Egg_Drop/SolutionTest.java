package com.zjxjwxk.leetcode._0887_Super_Egg_Drop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void superEggDrop1() {
        int k = 1, n = 2;
        int ans = 2;
        assertEquals(ans, solution.superEggDrop(k, n));
    }

    @Test
    void superEggDrop2() {
        int k = 2, n = 6;
        int ans = 3;
        assertEquals(ans, solution.superEggDrop(k, n));
    }

    @Test
    void superEggDrop3() {
        int k = 3, n = 14;
        int ans = 4;
        assertEquals(ans, solution.superEggDrop(k, n));
    }
}