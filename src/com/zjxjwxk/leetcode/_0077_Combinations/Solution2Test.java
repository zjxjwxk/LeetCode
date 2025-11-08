package com.zjxjwxk.leetcode._0077_Combinations;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void combine() {
        int n = 4, k = 2;
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {1, 2},
                {1, 3},
                {1, 4},
                {2, 3},
                {2, 4},
                {3, 4}
        });
        assertEquals(ans, solution2.combine(n, k));
    }
}