package com.zjxjwxk.leetcode._1002_Find_Common_Characters;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void commonChars() {
        String[] A = {"bella", "label", "roller"};
        String[] ans = {"e", "l", "l"};
        List<String> resultList = solution.commonChars(A);
        assertArrayEquals(ans, resultList.toArray(new String[0]));
    }
}