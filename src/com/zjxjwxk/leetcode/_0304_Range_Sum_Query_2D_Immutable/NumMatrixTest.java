package com.zjxjwxk.leetcode._0304_Range_Sum_Query_2D_Immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumMatrixTest {

    private final NumMatrix numMatrix = new NumMatrix(new int[][]{
            {3, 0, 1, 4, 2},
            {5, 6, 3, 2, 1},
            {1, 2, 0, 1, 5},
            {4, 1, 0, 1, 7},
            {1, 0, 3, 0, 5}
    });

    @Test
    void sumRegion1() {
        assertEquals(8, numMatrix.sumRegion(2, 1, 4, 3));
    }

    @Test
    void sumRegion2() {
        assertEquals(11, numMatrix.sumRegion(1, 1, 2, 2));
    }

    @Test
    void sumRegion3() {
        assertEquals(8, numMatrix.sumRegion(2, 1, 4, 3));
    }
}