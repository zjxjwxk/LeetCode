package com.zjxjwxk.leetcode._LCR_143_Is_Sub_Structure_Tree;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isSubStructure() {
        TreeNode A = DSFactory.newTree(new Integer[]{1, 7, 5});
        TreeNode B = DSFactory.newTree(new Integer[]{6, 1});
        assertFalse(solution.isSubStructure(A, B));
    }

    @Test
    void isSubStructure2() {
        TreeNode A = DSFactory.newTree(new Integer[]{3, 6, 7, 1, 8});
        TreeNode B = DSFactory.newTree(new Integer[]{6, 1});
        assertTrue(solution.isSubStructure(A, B));
    }
}