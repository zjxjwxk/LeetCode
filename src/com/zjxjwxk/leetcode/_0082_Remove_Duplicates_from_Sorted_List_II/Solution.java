package com.zjxjwxk.leetcode._0082_Remove_Duplicates_from_Sorted_List_II;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * 一次遍历
 * @author Xinkang Wu
 * @date 2021/3/25 13:31
 */
public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode p = dummyHead;
        while (p.next != null && p.next.next != null) {
            ListNode temp = p.next, q = temp;
            while (q.next != null && q.next.val == q.val) {
                q = q.next;
            }
            if (q == temp) {
                p = p.next;
            } else {
                p.next = q.next;
            }
        }
        return dummyHead.next;
    }
}
