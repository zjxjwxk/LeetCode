package com.zjxjwxk.leetcode._0106_Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Xinkang Wu
 * @date 2020/9/25 2:04 下午
 */
public class Solution {

    int[] inorder, postorder;
    int postRight;
    Map<Integer, Integer> valToIndexMap = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int len = inorder.length;
        this.inorder = inorder;
        this.postorder = postorder;
        this.postRight = len - 1;
        for (int i = 0; i < len; ++i) {
            valToIndexMap.put(inorder[i], i);
        }
        return build(0, len - 1);
    }

    private TreeNode build(int inLeft, int inRight) {
        if (inLeft > inRight) {
            return null;
        }
        int rootVal = postorder[postRight--], i = valToIndexMap.get(rootVal);
        TreeNode root = new TreeNode(rootVal);
        root.right = build(i + 1, inRight);
        root.left = build(inLeft, i - 1);
        return root;
    }

    /**
     * Definition for a binary tree node.
     */
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
