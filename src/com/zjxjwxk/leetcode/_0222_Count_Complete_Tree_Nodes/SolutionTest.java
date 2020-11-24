package com.zjxjwxk.leetcode._0222_Count_Complete_Tree_Nodes;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countNodes1() {
        TreeNode root = DSFactory.newTree(new Integer[]{1, 2, 3, 4, 5, 6});
        int ans = 6;
        assertEquals(ans, solution.countNodes(root));
    }

    @Test
    void countNodes2() {
        TreeNode root = DSFactory.newTree(new Integer[]{});
        int ans = 0;
        assertEquals(ans, solution.countNodes(root));
    }

    @Test
    void countNodes3() {
        TreeNode root = DSFactory.newTree(new Integer[]{1});
        int ans = 1;
        assertEquals(ans, solution.countNodes(root));
    }

    @Test
    void countNodes4() {
        TreeNode root = DSFactory.newTree(new Integer[]{1, 2});
        int ans = 2;
        assertEquals(ans, solution.countNodes(root));
    }
}