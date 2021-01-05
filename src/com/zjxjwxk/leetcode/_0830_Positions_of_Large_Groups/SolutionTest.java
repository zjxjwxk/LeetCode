package com.zjxjwxk.leetcode._0830_Positions_of_Large_Groups;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void largeGroupPositions1() {
        String s = "abbxxxxzzy";
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {3, 6}
        });
        assertEquals(ans, solution.largeGroupPositions(s));
    }

    @Test
    void largeGroupPositions2() {
        String s = "abc";
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{

        });
        assertEquals(ans, solution.largeGroupPositions(s));
    }

    @Test
    void largeGroupPositions3() {
        String s = "abcdddeeeeaabbbcd";
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {3, 5},
                {6, 9},
                {12, 14}
        });
        assertEquals(ans, solution.largeGroupPositions(s));
    }

    @Test
    void largeGroupPositions4() {
        String s = "aba";
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{

        });
        assertEquals(ans, solution.largeGroupPositions(s));
    }
}