package com.zjxjwxk.leetcode.util;

/**
 * @author Xinkang Wu
 * @date 2020/10/27 10:38 上午
 */
public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
