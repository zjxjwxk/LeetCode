package com.zjxjwxk.leetcode._0655_Print_Binary_Tree;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void printTree() {
        TreeNode root = DSFactory.newTree(new Integer[]{1, 2});
        List<List<String>> ans = DSFactory.newArrayList(new String[][]{
                {"", "1", ""},
                {"2", "", ""}
        });
        assertEquals(ans, solution.printTree(root));
    }

    @Test
    void printTree2() {
        TreeNode root = DSFactory.newTree(new Integer[]{1, 2, 3, null, 4});
        List<List<String>> ans = DSFactory.newArrayList(new String[][]{
                {"", "", "", "1", "", "", ""},
                {"", "2", "", "", "", "3", ""},
                {"", "", "4", "", "", "", ""}
        });
        assertEquals(ans, solution.printTree(root));
    }

    @Test
    void printTree3() {
        TreeNode root = DSFactory.newTree(new Integer[]{1});
        List<List<String>> ans = DSFactory.newArrayList(new String[][]{
                {"1"}
        });
        List<List<String>> res = solution.printTree(root);
        assertEquals(ans, res);
    }
}