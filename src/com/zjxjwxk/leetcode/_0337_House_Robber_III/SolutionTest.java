package com.zjxjwxk.leetcode._0337_House_Robber_III;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void rob1() {
        TreeNode root = DSFactory.newTree(new Integer[]{3, 2, 3, null, 3, null, 1});
        int ans = 7;
        assertEquals(ans, solution.rob(root));
    }

    @Test
    void rob2() {
        TreeNode root = DSFactory.newTree(new Integer[]{3, 4, 5, 1, 3, null, 1});
        int ans = 9;
        assertEquals(ans, solution.rob(root));
    }
}