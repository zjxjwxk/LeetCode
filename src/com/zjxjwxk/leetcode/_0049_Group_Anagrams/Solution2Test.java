package com.zjxjwxk.leetcode._0049_Group_Anagrams;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void groupAnagrams() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> ans = DSFactory.newArrayList(new String[][]{
                {"eat", "tea", "ate"},
                {"tan", "nat"},
                {"bat"}
        });
        assertEquals(ans, solution2.groupAnagrams(strs));
    }
}