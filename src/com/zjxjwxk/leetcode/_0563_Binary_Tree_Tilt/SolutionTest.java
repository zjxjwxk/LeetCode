package com.zjxjwxk.leetcode._0563_Binary_Tree_Tilt;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findTilt1() {
        TreeNode root = DSFactory.newTree(new Integer[]{1, 2, 3});
        int ans = 1;
        assertEquals(ans, solution.findTilt(root));
    }

    @Test
    void findTilt2() {
        TreeNode root = DSFactory.newTree(new Integer[]{4, 2, 9, 3, 5, null, 7});
        int ans = 15;
        assertEquals(ans, solution.findTilt(root));
    }

    @Test
    void findTilt3() {
        TreeNode root = DSFactory.newTree(new Integer[]{21, 7, 14, 1, 1, 2, 2, 3, 3});
        int ans = 9;
        assertEquals(ans, solution.findTilt(root));
    }
}