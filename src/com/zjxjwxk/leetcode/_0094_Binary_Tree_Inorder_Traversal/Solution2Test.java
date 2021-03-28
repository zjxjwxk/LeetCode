package com.zjxjwxk.leetcode._0094_Binary_Tree_Inorder_Traversal;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void inorderTraversal1() {
        TreeNode root = DSFactory.newTree(new Integer[]{1, null, 2, 3});
        List<Integer> ans = Arrays.asList(1, 3, 2);
        assertEquals(ans, solution2.inorderTraversal(root));
    }

    @Test
    void inorderTraversal2() {
        TreeNode root = null;
        List<Integer> ans = new ArrayList<>();
        assertEquals(ans, solution2.inorderTraversal(root));
    }

    @Test
    void inorderTraversal3() {
        TreeNode root = DSFactory.newTree(new Integer[]{1});
        List<Integer> ans = Collections.singletonList(1);
        assertEquals(ans, solution2.inorderTraversal(root));
    }
}