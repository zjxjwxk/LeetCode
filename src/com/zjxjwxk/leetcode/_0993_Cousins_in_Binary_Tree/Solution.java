package com.zjxjwxk.leetcode._0993_Cousins_in_Binary_Tree;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * DFS
 * @author Xinkang Wu
 * @date 2021/5/17 22:40
 */
public class Solution {

    private int level;
    private TreeNode parent;

    public boolean isCousins(TreeNode root, int x, int y) {
        preorder(root, x, 0, null);
        int level1 = this.level;
        TreeNode parent1 = this.parent;
        preorder(root, y, 0, null);
        int level2 = this.level;
        TreeNode parent2 = this.parent;
        return level1 == level2 && parent1 != parent2;
    }

    private boolean preorder(TreeNode root, int target, int level, TreeNode parent) {
        if (root == null) {
            return false;
        }
        if (root.val == target) {
            this.level = level;
            this.parent = parent;
            return true;
        }
        return preorder(root.left, target, level + 1, root) || preorder(root.right, target, level + 1, root);
    }
}
