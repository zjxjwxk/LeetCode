package com.zjxjwxk.leetcode._1609_Even_Odd_Tree;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isEvenOddTree1() {
        TreeNode root = DSFactory.newTree(new Integer[]{
                1, 10, 4, 3, null, 7, 9, 12, 8, 6, null, null, 2
        });
        assertTrue(solution.isEvenOddTree(root));
    }

    @Test
    void isEvenOddTree2() {
        TreeNode root = DSFactory.newTree(new Integer[]{
                5, 4, 2, 3, 3, 7
        });
        assertFalse(solution.isEvenOddTree(root));
    }

    @Test
    void isEvenOddTree3() {
        TreeNode root = DSFactory.newTree(new Integer[]{
                5, 9, 1, 3, 5, 7
        });
        assertFalse(solution.isEvenOddTree(root));
    }

    @Test
    void isEvenOddTree4() {
        TreeNode root = DSFactory.newTree(new Integer[]{
                1
        });
        assertTrue(solution.isEvenOddTree(root));
    }

    @Test
    void isEvenOddTree5() {
        TreeNode root = DSFactory.newTree(new Integer[]{
                11, 8, 6, 1, 3, 9, 11, 30, 20, 18, 16, 12, 10, 4, 2, 17
        });
        assertTrue(solution.isEvenOddTree(root));
    }
}