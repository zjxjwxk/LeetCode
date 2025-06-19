package com.zjxjwxk.leetcode._0021_Merge_Two_Sorted_Lists;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * 迭代
 *
 * @author zjxjwxk
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        ListNode p1 = list1, p2 = list2, dummyHead = new ListNode(), tail = dummyHead;
        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                tail.next = p1;
                p1 = p1.next;
            } else {
                tail.next = p2;
                p2 = p2.next;
            }
            tail = tail.next;
        }
        tail.next = p1 == null ? p2 : p1;
        return dummyHead.next;
    }
}