package com.zjxjwxk.leetcode._1583_Count_Unhappy_Friends;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void unhappyFriends1() {
        int n = 4;
        int[][] preferences = {
                {1, 2, 3}, {3, 2, 0}, {3, 1, 0}, {1, 2, 0}
        };
        int[][] pairs = {
                {0, 1}, {2, 3}
        };
        int ans = 2;
        assertEquals(ans, solution2.unhappyFriends(n, preferences, pairs));
    }

    @Test
    void unhappyFriends2() {
        int n = 2;
        int[][] preferences = {
                {1}, {0}
        };
        int[][] pairs = {
                {1, 0}
        };
        int ans = 0;
        assertEquals(ans, solution2.unhappyFriends(n, preferences, pairs));
    }

    @Test
    void unhappyFriends3() {
        int n = 4;
        int[][] preferences = {
                {1, 3, 2}, {2, 3, 0}, {1, 3, 0}, {0, 2, 1}
        };
        int[][] pairs = {
                {1, 3}, {0, 2}
        };
        int ans = 4;
        assertEquals(ans, solution2.unhappyFriends(n, preferences, pairs));
    }
}