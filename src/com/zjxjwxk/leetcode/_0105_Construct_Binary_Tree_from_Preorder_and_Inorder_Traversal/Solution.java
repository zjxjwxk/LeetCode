package com.zjxjwxk.leetcode._0105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal;

/**
 * @author zjxjwxk
 * @date 2020/7/26 11:48 下午
 */
public class Solution {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        int len = preorder.length;
        return build(preorder, inorder, 0, len - 1, 0, len - 1);
    }

    public static TreeNode build(int[] preorder, int[] inorder,
                          int preLeft, int preRight,
                          int inLeft, int inRight) {
        if (preLeft > preRight) {
            return null;
        }
        int root = preorder[preLeft], k, leftNum;
        TreeNode node = new TreeNode(root);
        for (k = inLeft; k <= inRight; ++k) {
            if (inorder[k] == root) {
                break;
            }
        }
        leftNum = k - inLeft;

        node.left = build(preorder, inorder, preLeft + 1, preLeft + leftNum, inLeft, k - 1);
        node.right = build(preorder, inorder, preLeft + leftNum + 1, preRight, k + 1, inRight);
        return node;
    }

    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        TreeNode node = buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        preOrder(node);
    }
}

/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}