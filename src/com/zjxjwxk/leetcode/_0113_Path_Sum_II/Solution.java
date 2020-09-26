package com.zjxjwxk.leetcode._0113_Path_Sum_II;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xinkang Wu
 * @date 2020/9/26 10:22 上午
 */
public class Solution {

    private final List<Integer> path = new ArrayList<>();
    private final List<List<Integer>> pathList = new ArrayList<>();
    private int sum;

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        this.sum = sum;
        findPath(root, 0);
        return pathList;
    }

    private void findPath(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        sum += root.val;
        path.add(root.val);
        if (root.left == null && root.right == null) {
            if (sum == this.sum) {
                pathList.add(new ArrayList<>(path));
            }
            path.remove(path.size() - 1);
            return;
        }
        findPath(root.left, sum);
        findPath(root.right, sum);
        path.remove(path.size() - 1);
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
