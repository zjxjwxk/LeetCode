package com.zjxjwxk.leetcode._0662_Maximum_Width_of_Binary_Tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void widthOfBinaryTree1() {
        TreeNode root = DSFactory.newTree(new Integer[] {1, 3, 2, 5, 3, null, 9});
        int ans = 4;
        assertEquals(ans, solution.widthOfBinaryTree(root));
    }

    @Test
    void widthOfBinaryTree2() {
        TreeNode root = DSFactory.newTree(new Integer[] {1, 3, null, 5, 3});
        int ans = 2;
        assertEquals(ans, solution.widthOfBinaryTree(root));
    }

    @Test
    void widthOfBinaryTree3() {
        TreeNode root = DSFactory.newTree(new Integer[] {1, 3, 2, 5});
        int ans = 2;
        assertEquals(ans, solution.widthOfBinaryTree(root));
    }

    @Test
    void widthOfBinaryTree4() {
        TreeNode root = DSFactory.newTree(new Integer[] {1, 3, 2, 5, null, null, 9, 6, null, 7});
        int ans = 7;
        assertEquals(ans, solution.widthOfBinaryTree(root));
    }

    @Test
    void widthOfBinaryTree() {
        TreeNode root = DSFactory.newTree(new Integer[] {1, 1, 1, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null,
                1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1,
                null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null,
                1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1,
                null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null,
                1, null, 1, null, 1, null, 1, null, null, 1, 1, null, 1, null, 1, null, 1, null, 1, null});
        int ans = 2147483645;
        assertEquals(ans, solution.widthOfBinaryTree(root));
    }
}
