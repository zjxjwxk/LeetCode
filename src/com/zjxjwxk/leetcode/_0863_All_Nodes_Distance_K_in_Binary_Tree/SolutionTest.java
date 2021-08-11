package com.zjxjwxk.leetcode._0863_All_Nodes_Distance_K_in_Binary_Tree;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void distanceK() {
        TreeNode root = DSFactory.newTree(new Integer[]{
                3, 5, 1, 6, 2, 0, 8, null, null, 7, 4
        });
        TreeNode target = root.left;
        int k = 2;
        List<Integer> ans = Arrays.asList(7, 4, 1);
        assertEquals(ans, solution.distanceK(root, target, k));
    }
}