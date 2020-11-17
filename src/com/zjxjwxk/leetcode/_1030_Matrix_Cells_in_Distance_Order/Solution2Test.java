package com.zjxjwxk.leetcode._1030_Matrix_Cells_in_Distance_Order;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void allCellsDistOrder1() {
        int R = 1, C = 2, r0 = 0, c0 = 0;
        int[][] ans = {
                {0, 0},
                {0, 1}
        };
        assertArrayEquals(ans, solution2.allCellsDistOrder(R, C, r0, c0));
    }

    @Test
    void allCellsDistOrder2() {
        int R = 2, C = 2, r0 = 0, c0 = 1;
        int[][] ans = {
                {0, 1},
                {0, 0},
                {1, 1},
                {1, 0}
        };
        assertArrayEquals(ans, solution2.allCellsDistOrder(R, C, r0, c0));
    }

    @Test
    void allCellsDistOrder3() {
        int R = 2, C = 3, r0 = 1, c0 = 2;
        int[][] ans = {
                {1, 2},
                {0, 2},
                {1, 1},
                {0, 1},
                {1, 0},
                {0, 0
                }
        };
        assertArrayEquals(ans, solution2.allCellsDistOrder(R, C, r0, c0));
    }
}