package com.zjxjwxk.leetcode._0671_Second_Minimum_Node_In_a_Binary_Tree;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findSecondMinimumValue1() {
        TreeNode root = DSFactory.newTree(new Integer[]{
                2, 2, 5, null, null, 5, 7
        });
        int ans = 5;
        assertEquals(ans, solution.findSecondMinimumValue(root));
    }

    @Test
    void findSecondMinimumValue2() {
        TreeNode root = DSFactory.newTree(new Integer[]{
                2, 2, 2
        });
        int ans = -1;
        assertEquals(ans, solution.findSecondMinimumValue(root));
    }

    @Test
    void findSecondMinimumValue3() {
        TreeNode root = DSFactory.newTree(new Integer[]{
                1, 1, 3, 1, 1, 3, 4, 3, 1, 1, 1, 3, 8, 4, 8, 3, 3, 1, 6, 2, 1
        });
        int ans = 2;
        assertEquals(ans, solution.findSecondMinimumValue(root));
    }
}