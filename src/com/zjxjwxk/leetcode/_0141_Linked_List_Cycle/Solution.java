package com.zjxjwxk.leetcode._0141_Linked_List_Cycle;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * 快慢指针
 *
 * @author zjxjwxk
 * @date 2020/10/9 2:10 下午
 */
public class Solution {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode p = head, q = head;
        while (q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
            if (p == q) {
                return true;
            }
        }
        return false;
    }
}
