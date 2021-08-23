package com.zjxjwxk.leetcode._0987_Vertical_Order_Traversal_of_a_Binary_Tree;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void verticalTraversal1() {
        TreeNode root = DSFactory.newTree(new Integer[]{
                3, 9, 20, null, null, 15, 7
        });
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {9}, {3, 15}, {20}, {7}
        });
        assertEquals(ans, solution.verticalTraversal(root));
    }

    @Test
    void verticalTraversal2() {
        TreeNode root = DSFactory.newTree(new Integer[]{
                1, 2, 3, 4, 5, 6, 7
        });
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {4}, {2}, {1, 5, 6}, {3}, {7}
        });
        assertEquals(ans, solution.verticalTraversal(root));
    }

    @Test
    void verticalTraversal3() {
        TreeNode root = DSFactory.newTree(new Integer[]{
                1, 2, 3, 4, 6, 5, 7
        });
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {4}, {2}, {1, 5, 6}, {3}, {7}
        });
        assertEquals(ans, solution.verticalTraversal(root));
    }

    @Test
    void verticalTraversal4() {
        TreeNode root = DSFactory.newTree(new Integer[]{
                3, 1, 4, 0, 2, 2
        });
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {0}, {1}, {3, 2, 2}, {4}
        });
        assertEquals(ans, solution.verticalTraversal(root));
    }
}