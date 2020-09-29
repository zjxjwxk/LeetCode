package com.zjxjwxk.leetcode._0145_Binary_Tree_Postorder_Traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * 递归
 * @author zjxjwxk
 * @date 2020/9/29 10:21 上午
 */
public class Solution {

    private final List<Integer> result = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return result;
        }
        postorder(root);
        return result;
    }

    private void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        result.add(root.val);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
