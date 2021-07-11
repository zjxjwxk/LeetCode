package com.zjxjwxk.leetcode._0274_H_Index;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void hIndex1() {
        int[] citations = {3, 0, 6, 1, 5};
        int ans = 3;
        assertEquals(ans, solution2.hIndex(citations));
    }

    @Test
    void hIndex2() {
        int[] citations = {1};
        int ans = 1;
        assertEquals(ans, solution2.hIndex(citations));
    }
}