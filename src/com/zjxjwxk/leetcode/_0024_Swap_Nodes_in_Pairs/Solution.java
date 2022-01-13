package com.zjxjwxk.leetcode._0024_Swap_Nodes_in_Pairs;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * 迭代
 * @author zjxjwxk
 * @date 2020/10/13 8:59 上午
 */
public class Solution {

    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode cur = dummyHead;
        ListNode first, second;
        while ((first = cur.next) != null && (second = first.next) != null) {
            first.next = second.next;
            second.next = first;
            cur.next = second;
            cur = first;
        }
        return dummyHead.next;
    }
}
