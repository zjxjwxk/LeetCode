package com.zjxjwxk.leetcode._0119_Pascal_s_Triangle_II;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void getRow1() {
        int rowIndex = 3;
        List<Integer> ans = Arrays.asList(1, 3, 3, 1);
        assertEquals(ans, solution.getRow(rowIndex));
    }

    @Test
    void getRow2() {
        int rowIndex = 1;
        List<Integer> ans = Arrays.asList(1, 1);
        assertEquals(ans, solution.getRow(rowIndex));
    }

    @Test
    void getRow3() {
        int rowIndex = 0;
        List<Integer> ans = Collections.singletonList(1);
        assertEquals(ans, solution.getRow(rowIndex));
    }
}