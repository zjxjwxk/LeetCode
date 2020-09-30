package com.zjxjwxk.leetcode._0145_Binary_Tree_Postorder_Traversal;

import java.util.*;

/**
 * 迭代
 * @author zjxjwxk
 * @date 2020/9/29 10:27 上午
 */
public class Solution2 {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder = new ArrayList<>();
        if (root == null) {
            return postorder;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode pre = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.right != null && root.right != pre) {
                stack.push(root);
                root = root.right;
            } else {
                postorder.add(root.val);
                pre = root;
                root = null;
            }
        }
        return postorder;
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
