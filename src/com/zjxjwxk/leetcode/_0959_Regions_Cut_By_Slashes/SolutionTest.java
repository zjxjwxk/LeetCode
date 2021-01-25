package com.zjxjwxk.leetcode._0959_Regions_Cut_By_Slashes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void regionsBySlashes1() {
        String[] grid = {
                " /",
                "/ "
        };
        int ans = 2;
        assertEquals(ans, solution.regionsBySlashes(grid));
    }

    @Test
    void regionsBySlashes2() {
        String[] grid = {
                " /",
                "  "
        };
        int ans = 1;
        assertEquals(ans, solution.regionsBySlashes(grid));
    }

    @Test
    void regionsBySlashes3() {
        String[] grid = {
                "\\/",
                "/\\"
        };
        int ans = 4;
        assertEquals(ans, solution.regionsBySlashes(grid));
    }

    @Test
    void regionsBySlashes4() {
        String[] grid = {
                "/\\",
                "\\/"
        };
        int ans = 5;
        assertEquals(ans, solution.regionsBySlashes(grid));
    }

    @Test
    void regionsBySlashes5() {
        String[] grid = {
                "//",
                "/ "
        };
        int ans = 3;
        assertEquals(ans, solution.regionsBySlashes(grid));
    }
}