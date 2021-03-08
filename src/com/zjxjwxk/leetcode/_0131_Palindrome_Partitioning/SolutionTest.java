package com.zjxjwxk.leetcode._0131_Palindrome_Partitioning;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void partition() {
        String s = "aab";
        List<List<String>> ans = DSFactory.newArrayList(new String[][]{
                {"a", "a", "b"},
                {"aa", "b"}
        });
        assertEquals(ans, solution.partition(s));
    }
}