package com.zjxjwxk.leetcode._0144_Binary_Tree_Preorder_Traversal;

import com.zjxjwxk.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 递归
 * @author Xinkang Wu
 * @date 2020/10/27 10:36 上午
 */
public class Solution {

    private final List<Integer> ans = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return ans;
    }

    private void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        ans.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}
