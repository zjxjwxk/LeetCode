package com.zjxjwxk.leetcode._0530_Minimum_Absolute_Difference_in_BST;

/**
 * @author zjxjwxk
 * @date 2020/10/12 9:48 上午
 */
public class Solution {

    private int min = Integer.MAX_VALUE, pre = -1;

    public int getMinimumDifference(TreeNode root) {
        recursive(root);
        return min;
    }

    private void recursive(TreeNode root) {
        if (root == null) {
            return;
        }
        recursive(root.left);
        if (pre != -1) {
            int difference = root.val - pre;
            if (difference < min) {
                min = difference;
            }
        }
        pre = root.val;
        recursive(root.right);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(2);
        root.right.right = null;
        Solution solution = new Solution();
        System.out.println(solution.getMinimumDifference(root));
    }
}
