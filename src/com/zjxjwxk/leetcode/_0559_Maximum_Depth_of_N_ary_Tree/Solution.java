package com.zjxjwxk.leetcode._0559_Maximum_Depth_of_N_ary_Tree;

import java.util.List;

/**
 * 深度优先搜索
 * @author Xinkang Wu
 * @date 2021/11/21 00:22
 */
public class Solution {

    private int maxDepth;

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        maxDepth = 0;
        dfs(root, 1);
        return maxDepth;
    }

    private void dfs(Node root, int depth) {
        if (root.children == null || root.children.isEmpty()) {
            maxDepth = Math.max(maxDepth, depth);
            return;
        }
        for (Node child : root.children) {
            dfs(child, depth + 1);
        }
    }

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    }
}
