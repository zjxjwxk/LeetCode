package com.zjxjwxk.leetcode._0144_Binary_Tree_Preorder_Traversal;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void preorderTraversal() {
        TreeNode root = DSFactory.newTree(new Integer[]{1, null, 2, 3});
        List<Integer> ans = Arrays.asList(1, 2, 3);
        List<Integer> result = solution2.preorderTraversal(root);
        assertEquals(ans, result);
    }
}