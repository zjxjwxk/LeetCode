package com.zjxjwxk.leetcode._0839_Similar_String_Groups;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numSimilarGroups1() {
        String[] strs = {"tars", "rats", "arts", "star"};
        int ans = 2;
        assertEquals(ans, solution.numSimilarGroups(strs));
    }

    @Test
    void numSimilarGroups2() {
        String[] strs = {"omv", "ovm"};
        int ans = 1;
        assertEquals(ans, solution.numSimilarGroups(strs));
    }
}