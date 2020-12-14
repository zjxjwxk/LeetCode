package com.zjxjwxk.leetcode._0049_Group_Anagrams;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void groupAnagrams() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> ans = DSFactory.newArrayList(new String[][]{
                {"eat", "tea", "ate"},
                {"bat"},
                {"tan", "nat"}
        });
        assertEquals(ans, solution.groupAnagrams(strs));
    }
}