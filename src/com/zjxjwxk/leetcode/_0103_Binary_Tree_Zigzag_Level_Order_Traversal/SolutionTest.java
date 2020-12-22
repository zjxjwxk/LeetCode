package com.zjxjwxk.leetcode._0103_Binary_Tree_Zigzag_Level_Order_Traversal;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void zigzagLevelOrder1() {
        TreeNode root = DSFactory.newTree(new Integer[]{3, 9, 20, null, null, 15, 7});
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {3},
                {20, 9},
                {15, 7}
        });
        assertEquals(ans, solution.zigzagLevelOrder(root));
    }

    @Test
    void zigzagLevelOrder2() {
        TreeNode root = DSFactory.newTree(new Integer[]{1, 2, 3, 4, null, null, 5});
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {1},
                {3, 2},
                {4, 5}
        });
        assertEquals(ans, solution.zigzagLevelOrder(root));
    }
}