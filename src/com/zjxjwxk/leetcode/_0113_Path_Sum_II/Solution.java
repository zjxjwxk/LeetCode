package com.zjxjwxk.leetcode._0113_Path_Sum_II;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Xinkang Wu
 * @date 2020/9/26 10:22 上午
 */
public class Solution {

    private final Deque<Integer> path = new LinkedList<>();
    private final List<List<Integer>> pathList = new LinkedList<>();
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
        path.offerLast(root.val);
        if (root.left == null && root.right == null && sum == this.sum) {
            pathList.add(new ArrayList<>(path));
        }
        findPath(root.left, sum);
        findPath(root.right, sum);
        path.pollLast();
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
