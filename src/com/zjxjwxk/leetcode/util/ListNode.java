package com.zjxjwxk.leetcode.util;

import java.util.Objects;

/**
 * 链表节点
 * @author zjxjwxk
 * @date 2020/10/13 9:16 上午
 */
public class ListNode {

    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNode listNode = (ListNode) o, thisNode = this;
        while (thisNode != null && listNode != null) {
            if (thisNode.val != listNode.val) {
                return false;
            }
            thisNode = thisNode.next;
            listNode = listNode.next;
        }
        return thisNode == null && listNode == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
