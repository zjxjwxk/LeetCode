package com.zjxjwxk.leetcode._1232_Check_If_It_Is_a_Straight_Line;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void checkStraightLine1() {
        int[][] coordinates = {
                {1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}
        };
        assertTrue(solution2.checkStraightLine(coordinates));
    }

    @Test
    void checkStraightLine2() {
        int[][] coordinates = {
                {1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}
        };
        assertFalse(solution2.checkStraightLine(coordinates));
    }

    @Test
    void checkStraightLine3() {
        int[][] coordinates = {
                {0, 0}, {0, 1}, {0, -1}
        };
        assertTrue(solution2.checkStraightLine(coordinates));
    }
}