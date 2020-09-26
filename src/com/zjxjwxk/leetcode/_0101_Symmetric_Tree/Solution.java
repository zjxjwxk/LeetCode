package com.zjxjwxk.leetcode._0101_Symmetric_Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

/**
 * 深度优先遍历（递归）
 * @author zjxjwxk
 */
public class Solution {

    public boolean isSymmetric(TreeNode root) {
        return root == null || recursive(root.left, root.right);
    }
    private boolean recursive(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && recursive(p.left, q.right) && recursive(p.right, q.left);
    }
}
