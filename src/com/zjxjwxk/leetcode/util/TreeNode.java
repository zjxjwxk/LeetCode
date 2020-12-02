package com.zjxjwxk.leetcode.util;

import java.util.Objects;

/**
 * 二叉树节点
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return isEqual(this, (TreeNode) o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }

    private boolean isEqual(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        return root1.val == root2.val && isEqual(root1.left, root2.left) && isEqual(root1.right, root2.right);
    }
}
