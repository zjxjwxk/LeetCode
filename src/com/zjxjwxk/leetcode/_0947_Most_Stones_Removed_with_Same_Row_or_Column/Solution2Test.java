package com.zjxjwxk.leetcode._0947_Most_Stones_Removed_with_Same_Row_or_Column;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void removeStones1() {
        int[][] stones = {
                {0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}
        };
        int ans = 5;
        assertEquals(ans, solution2.removeStones(stones));
    }

    @Test
    void removeStones2() {
        int[][] stones = {
                {0, 0}, {0, 2}, {1, 1}, {2, 0}, {2, 2}
        };
        int ans = 3;
        assertEquals(ans, solution2.removeStones(stones));
    }
}