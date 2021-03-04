package com.zjxjwxk.leetcode._0354_Russian_Doll_Envelopes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxEnvelopes1() {
        int[][] envelopes = {{5, 4}, {6, 4}, {6, 7}, {2, 3}};
        int ans = 3;
        assertEquals(ans, solution.maxEnvelopes(envelopes));
    }

    @Test
    void maxEnvelopes2() {
        int[][] envelopes = {{4, 5}, {4, 6}, {6, 7}, {2, 3}, {1, 1}};
        int ans = 4;
        assertEquals(ans, solution.maxEnvelopes(envelopes));
    }

    @Test
    void maxEnvelopes3() {
        int[][] envelopes = {{1, 3}, {3, 5}, {6, 7}, {6, 8}, {8, 4}, {9, 5}};
        int ans = 3;
        assertEquals(ans, solution.maxEnvelopes(envelopes));
    }

    @Test
    void maxEnvelopes4() {
        int[][] envelopes = {{46, 89}, {50, 53}, {52, 68}, {72, 45}, {77, 81}};
        int ans = 3;
        assertEquals(ans, solution.maxEnvelopes(envelopes));
    }
}