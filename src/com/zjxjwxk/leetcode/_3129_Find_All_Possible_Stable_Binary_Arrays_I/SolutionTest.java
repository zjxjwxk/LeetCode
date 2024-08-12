package com.zjxjwxk.leetcode._3129_Find_All_Possible_Stable_Binary_Arrays_I;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numberOfStableArrays() {
        int zero = 1, one = 1, limit = 2;
        int ans = 2;
        assertEquals(ans, solution.numberOfStableArrays(zero, one, limit));
    }

    @Test
    void numberOfStableArrays2() {
        int zero = 1, one = 2, limit = 1;
        int ans = 1;
        assertEquals(ans, solution.numberOfStableArrays(zero, one, limit));
    }

    @Test
    void numberOfStableArrays3() {
        int zero = 3, one = 3, limit = 2;
        int ans = 14;
        assertEquals(ans, solution.numberOfStableArrays(zero, one, limit));
    }

    @Test
    void numberOfStableArrays4() {
        int zero = 39, one = 20, limit = 18;
        int ans = 207227572;
        assertEquals(ans, solution.numberOfStableArrays(zero, one, limit));
    }
}