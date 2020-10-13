package com.zjxjwxk.leetcode._0024_Swap_Nodes_in_Pairs;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * @author zjxjwxk
 * @date 2020/10/13 8:59 上午
 */
public class Solution {

    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode pre = dummyHead, cur = head, next;
        while (cur != null && cur.next != null) {
            next = cur.next;
            cur.next = next.next;
            next.next = cur;
            pre.next = next;
            pre = cur;
            cur = cur.next;
        }
        return dummyHead.next;
    }
}
