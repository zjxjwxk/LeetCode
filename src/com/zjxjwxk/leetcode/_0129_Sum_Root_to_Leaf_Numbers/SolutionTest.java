package com.zjxjwxk.leetcode._0129_Sum_Root_to_Leaf_Numbers;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sumNumbers() {
        Integer[] tree = {1, 2, 3};
        TreeNode root = DSFactory.newTree(tree);
        int ans = 25, result = solution.sumNumbers(root);
        assertEquals(ans, result);
    }
}