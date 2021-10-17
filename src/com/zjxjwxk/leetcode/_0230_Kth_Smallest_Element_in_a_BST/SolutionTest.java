package com.zjxjwxk.leetcode._0230_Kth_Smallest_Element_in_a_BST;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void kthSmallest1() {
        TreeNode root = DSFactory.newTree(new Integer[]{
                3, 1, 4, null, 2
        });
        int k = 1;
        int ans = 1;
        assertEquals(ans, solution.kthSmallest(root, k));
    }

    @Test
    void kthSmallest2() {
        TreeNode root = DSFactory.newTree(new Integer[]{
                5, 3, 6, 2, 4, null, null, 1
        });
        int k = 3;
        int ans = 3;
        assertEquals(ans, solution.kthSmallest(root, k));
    }
}