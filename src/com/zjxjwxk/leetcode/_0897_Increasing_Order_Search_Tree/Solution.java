package com.zjxjwxk.leetcode._0897_Increasing_Order_Search_Tree;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * 中序遍历
 * @author Xinkang Wu
 * @date 2021/4/25 23:08
 */
public class Solution {

    private TreeNode cur;

    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummyNode = new TreeNode();
        cur = dummyNode;
        inorder(root);
        return dummyNode.right;
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        cur.right = root;
        cur = root;
        root.left = null;
        inorder(root.right);
    }
}
