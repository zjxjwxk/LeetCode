package com.zjxjwxk.leetcode._0450_Delete_Node_in_a_BST;

/**
 * @author Xinkang Wu
 * @date 2020/9/23 7:03 下午
 */
public class Solution {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.right == null) {
                TreeNode predecessor = root.left;
                while (predecessor.right != null) {
                    predecessor = predecessor.right;
                }
                root.val = predecessor.val;
                root.left = deleteNode(root.left, root.val);
            } else {
                TreeNode successor = root.right;
                while (successor.left != null) {
                    successor = successor.left;
                }
                root.val = successor.val;
                root.right = deleteNode(root.right, root.val);
            }
        }
        return root;
    }

    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {
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
