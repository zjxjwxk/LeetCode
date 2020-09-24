package com.zjxjwxk.leetcode._0501_Find_Mode_in_Binary_Search_Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xinkang Wu
 * @date 2020/9/24 7:58 上午
 */
public class Solution {

    private int now, maxCount, count;
    private List<Integer> modes = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }
        addMode(root);
        int[] result = new int[modes.size()];
        for (int i = 0; i < result.length; ++i) {
            result[i] = modes.get(i);
        }
        return result;
    }

    private void addMode(TreeNode root) {
        if (root == null) {
            return;
        }
        addMode(root.left);
        if (root.val == now) {
            ++count;
        } else {
            count = 1;
            now = root.val;
        }
        if (count == maxCount) {
            modes.add(now);
        }
        if (count > maxCount) {
            maxCount = count;
            modes.clear();
            modes.add(now);
        }
        addMode(root.right);
    }

    private void printArr(int[] arr) {
        for (int num :
                arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);
        root.left = null;
        root.right = node1;
        node1.left = node2;
        node1.right = null;
        node2.left = node2.right = null;
//        TreeNode root = new TreeNode(2);
//        TreeNode node1 = new TreeNode(1);
//        root.left = node1;
//        root.right = null;
//        node1.left = node1.right = null;
        solution.printArr(solution.findMode(root));
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
