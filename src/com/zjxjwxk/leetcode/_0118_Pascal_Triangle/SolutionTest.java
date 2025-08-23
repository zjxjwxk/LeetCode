package com.zjxjwxk.leetcode._0118_Pascal_Triangle;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void generate() {
        int numRows = 5;
        Integer[][] ans = {
                {1},
                {1, 1},
                {1, 2, 1},
                {1, 3, 3, 1},
                {1, 4, 6, 4, 1}
        };
        assertEquals(DSFactory.newArrayList(ans), solution.generate(numRows));
    }

    @Test
    void generate2() {
        int numRows = 1;
        Integer[][] ans = {{1}};
        assertEquals(DSFactory.newArrayList(ans), solution.generate(numRows));
    }
}