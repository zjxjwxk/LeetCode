package com.zjxjwxk.leetcode._0082_Remove_Duplicates_from_Sorted_List_II;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * 一次遍历
 * @author Xinkang Wu
 * @date 2021/3/25 13:31
 */
public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(0, head), p = dummyHead;
        while (p.next != null && p.next.next != null) {
            if (p.next.val == p.next.next.val) {
                int val = p.next.val;
                while (p.next != null && p.next.val == val) {
                    p.next = p.next.next;
                }
            } else {
                p = p.next;
            }
        }
        return dummyHead.next;
    }
}
