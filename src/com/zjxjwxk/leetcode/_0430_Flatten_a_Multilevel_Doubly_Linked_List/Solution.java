package com.zjxjwxk.leetcode._0430_Flatten_a_Multilevel_Doubly_Linked_List;

/**
 * 深度优先搜索
 * @author Xinkang Wu
 * @date 2021/9/24 14:19
 */
public class Solution {

    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }
        dfs(head);
        return head;
    }

    private Node dfs(Node p) {
        if (p == null) {
            return null;
        }
        while (true) {
            if (p.child != null) {
                Node next = p.next;
                Node last = dfs(p.child);
                p.next = p.child;
                p.next.prev = p;
                p.child = null;
                last.next = next;
                if (next != null) {
                    next.prev = last;
                    p = next;
                } else {
                    return last;
                }
            } else if (p.next != null) {
                p = p.next;
            } else {
                return p;
            }
        }
    }

    static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }
}
