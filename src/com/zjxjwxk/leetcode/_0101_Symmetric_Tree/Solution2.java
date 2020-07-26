package com.zjxjwxk.leetcode._0101_Symmetric_Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 广度优先遍历（队列迭代）
 * @author zjxjwxk
 */
public class Solution2 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while (!queue.isEmpty()) {
            TreeNode p = queue.poll();
            TreeNode q = queue.poll();
            if (p == null && q == null) {
                continue;
            }
            if (p == null || q == null) {
                return false;
            }
            if (p.val == q.val) {
                queue.add(p.left);
                queue.add(q.right);
                queue.add(p.right);
                queue.add(q.left);
            } else{
                return false;
            }
        }
        return true;
    }
}
