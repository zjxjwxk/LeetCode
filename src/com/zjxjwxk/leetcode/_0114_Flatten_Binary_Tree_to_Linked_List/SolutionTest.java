package com.zjxjwxk.leetcode._0114_Flatten_Binary_Tree_to_Linked_List;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void flatten() {
        TreeNode root = DSFactory.newTree(new Integer[]{1, 2, 5, 3, 4, null, 6});
        TreeNode ans = DSFactory.newTree(new Integer[]{1, null, 2, null, 3, null, 4, null, 5, null, 6});
        solution.flatten(root);
        assertEquals(ans, root);
    }

    @Test
    void flatten2() {
        TreeNode root = DSFactory.newTree(new Integer[]{});
        TreeNode ans = DSFactory.newTree(new Integer[]{});
        solution.flatten(root);
        assertEquals(ans, root);
    }

    @Test
    void flatten3() {
        TreeNode root = DSFactory.newTree(new Integer[]{0});
        TreeNode ans = DSFactory.newTree(new Integer[]{0});
        solution.flatten(root);
        assertEquals(ans, root);
    }

    @Test
    void flatten4() {
        TreeNode root = DSFactory.newTree(new Integer[]{1, null, 2, 3});
        TreeNode ans = DSFactory.newTree(new Integer[]{1, null, 2, null, 3});
        solution.flatten(root);
        assertEquals(ans, root);
    }
}