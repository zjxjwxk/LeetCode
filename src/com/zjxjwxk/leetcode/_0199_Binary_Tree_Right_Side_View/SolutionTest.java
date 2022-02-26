package com.zjxjwxk.leetcode._0199_Binary_Tree_Right_Side_View;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void rightSideView1() {
        TreeNode root = DSFactory.newTree(new Integer[]{1, 2, 3, null, 5, null, 4});
        List<Integer> ans = Arrays.asList(1, 3, 4);
        assertEquals(ans, solution.rightSideView(root));
    }

    @Test
    void rightSideView2() {
        TreeNode root = DSFactory.newTree(new Integer[]{1, null, 3});
        List<Integer> ans = Arrays.asList(1, 3);
        assertEquals(ans, solution.rightSideView(root));
    }

    @Test
    void rightSideView3() {
        TreeNode root = null;
        List<Integer> ans = new ArrayList<>();
        assertEquals(ans, solution.rightSideView(root));
    }
}