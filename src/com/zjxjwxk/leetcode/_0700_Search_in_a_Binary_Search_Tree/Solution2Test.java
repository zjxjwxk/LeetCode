package com.zjxjwxk.leetcode._0700_Search_in_a_Binary_Search_Tree;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void searchBST() {
        TreeNode root = DSFactory.newTree(new Integer[]{4, 2, 7, 1, 3});
        int val = 2;
        TreeNode ans = DSFactory.newTree(new Integer[]{2, 1, 3});
        assertEquals(ans, solution2.searchBST(root, val));
    }
}