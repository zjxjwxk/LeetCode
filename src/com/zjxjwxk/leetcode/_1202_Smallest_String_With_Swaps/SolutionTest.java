package com.zjxjwxk.leetcode._1202_Smallest_String_With_Swaps;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void smallestStringWithSwaps1() {
        String s = "dcab";
        List<List<Integer>> pairs = DSFactory.newArrayList(new Integer[][]{
                {0, 3}, {1, 2}
        });
        String ans = "bacd";
        assertEquals(ans, solution.smallestStringWithSwaps(s, pairs));
    }

    @Test
    void smallestStringWithSwaps2() {
        String s = "dcab";
        List<List<Integer>> pairs = DSFactory.newArrayList(new Integer[][]{
                {0, 3}, {1, 2}, {0, 2}
        });
        String ans = "abcd";
        assertEquals(ans, solution.smallestStringWithSwaps(s, pairs));
    }

    @Test
    void smallestStringWithSwaps3() {
        String s = "cba";
        List<List<Integer>> pairs = DSFactory.newArrayList(new Integer[][]{
                {0, 1}, {1, 2}
        });
        String ans = "abc";
        assertEquals(ans, solution.smallestStringWithSwaps(s, pairs));
    }
}