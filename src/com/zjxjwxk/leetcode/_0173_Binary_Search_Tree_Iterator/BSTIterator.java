package com.zjxjwxk.leetcode._0173_Binary_Search_Tree_Iterator;

import com.zjxjwxk.leetcode.util.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 迭代（栈）
 * @author Xinkang Wu
 * @date 2021/3/28 13:05
 */
public class BSTIterator {

    private final Deque<TreeNode> stack;
    private TreeNode cur;

    public BSTIterator(TreeNode root) {
        stack = new ArrayDeque<>();
        cur = root;
    }

    public int next() {
        while (cur != null) {
            stack.push(cur);
            cur = cur.left;
        }
        cur = stack.pop();
        int ret = cur.val;
        cur = cur.right;
        return ret;
    }

    public boolean hasNext() {
        return cur != null || !stack.isEmpty();
    }
}
