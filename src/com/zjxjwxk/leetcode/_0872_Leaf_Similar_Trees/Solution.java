package com.zjxjwxk.leetcode._0872_Leaf_Similar_Trees;

import com.zjxjwxk.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * DFS
 * @author Xinkang Wu
 * @date 2021/5/10 20:18
 */
public class Solution {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> sequence1 = new ArrayList<>();
        List<Integer> sequence2 = new ArrayList<>();
        dfs(root1, sequence1);
        dfs(root2, sequence2);
        return sequence1.equals(sequence2);
    }

    private void dfs(TreeNode root, List<Integer> sequence) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            sequence.add(root.val);
        } else {
            dfs(root.left, sequence);
            dfs(root.right, sequence);
        }
    }
}
