package com.zjxjwxk.leetcode._0655_Print_Binary_Tree;

import com.zjxjwxk.leetcode.util.TreeNode;

import java.util.*;

/**
 * @author Xinkang Wu
 * @date 2023/8/15 13:12
 */
public class Solution {

    private static int height;

    public List<List<String>> printTree(TreeNode root) {
        height = 0;
        dfs(root, 1);
        int m = height + 1, n = (int) Math.pow(2, height + 1) - 1;
        List<List<String>> res = new ArrayList<>(m);
        for (int i = 0; i < m; ++i) {
            res.add(new ArrayList<>(Collections.nCopies(n, "")));
        }
        res.get(0).set((n - 1) >> 1, String.valueOf(root.val));
        Map<TreeNode, int[]> indexMap = new HashMap<>();
        indexMap.put(root, new int[]{0, (n - 1) >> 1});
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int base = (n + 1) >> 1;
        while (!queue.isEmpty()) {
            base >>= 1;
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                TreeNode node = queue.poll();
                int[] index = indexMap.get(node);
                int r = index[0], c = index[1];
                if (node.left != null) {
                    queue.offer(node.left);
                    res.get(r + 1).set(c - base, String.valueOf(node.left.val));
                    indexMap.put(node.left, new int[]{r + 1, c - base});
                }
                if (node.right != null) {
                    queue.offer(node.right);
                    res.get(r + 1).set(c + base, String.valueOf(node.right.val));
                    indexMap.put(node.right, new int[]{r + 1, c + base});
                }
            }
        }
        return res;
    }

    private void dfs(TreeNode root, int level) {
        if (root == null) {
            height = Math.max(height, level - 2);
            return;
        }
        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }
}
