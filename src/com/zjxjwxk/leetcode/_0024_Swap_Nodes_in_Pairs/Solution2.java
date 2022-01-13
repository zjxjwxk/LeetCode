package com.zjxjwxk.leetcode._0024_Swap_Nodes_in_Pairs;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * 递归
 * @author zjxjwxk
 * @date 2020/10/13 8:59 上午
 */
public class Solution2 {

    public ListNode swapPairs(ListNode head) {
        ListNode newHead;
        if (head == null || (newHead = head.next) == null) {
            return head;
        }
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        return newHead;
    }
}
