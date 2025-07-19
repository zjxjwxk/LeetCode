package com.zjxjwxk.leetcode._0230_Kth_Smallest_Element_in_a_BST;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * 中序遍历（递归）
 *
 * @author Xinkang Wu
 * @date 2021/10/17 15:01
 */
public class Solution {

    private int index;

    public int kthSmallest(TreeNode root, int k) {
        index = 0;
        return postorder(root, k);
    }

    private int postorder(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }
        int leftVal = postorder(root.left, k);
        if (leftVal != -1) {
            return leftVal;
        }
        ++index;
        if (index == k) {
            return root.val;
        }
        return postorder(root.right, k);
    }
}
