package com.zjxjwxk.leetcode._0104_Maximum_Depth_of_Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 利用栈迭代
 * @author zjxjwxk
 */
public class Solution2 {

    public int maxDepth(TreeNode root) {
        Queue<Pair> stack = new LinkedList<>();
        if (root != null) {
            stack.add(new Pair(root, 1));
        }

        int depth = 0;
        while (!stack.isEmpty()) {
            Pair current = stack.poll();
            root = current.root;
            int currentDepth = current.depth;
            if (root != null) {
                depth = Math.max(depth, currentDepth);
                stack.add(new Pair(root.left, currentDepth + 1));
                stack.add(new Pair(root.right, currentDepth + 1));
            }
        }
        return depth;
    }

    static class Pair {
        public TreeNode root;
        public Integer depth;

        public Pair(TreeNode root, Integer depth) {
            this.root = root;
            this.depth = depth;
        }
    }

    public static void main(String[] args) {

    }
}
