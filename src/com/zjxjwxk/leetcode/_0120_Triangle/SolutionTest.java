package com.zjxjwxk.leetcode._0120_Triangle;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minimumTotal() {
        List<List<Integer>> triangle = DSFactory.newArrayList(new Integer[][]{
                {2}, {3, 4}, {6, 5, 7}, {4, 1, 8, 3}
        });
        int ans = 11;
        assertEquals(ans, solution.minimumTotal(triangle));
    }

    @Test
    void minimumTotal2() {
        List<List<Integer>> triangle = DSFactory.newArrayList(new Integer[][]{
                {-10}
        });
        int ans = -10;
        assertEquals(ans, solution.minimumTotal(triangle));
    }
}