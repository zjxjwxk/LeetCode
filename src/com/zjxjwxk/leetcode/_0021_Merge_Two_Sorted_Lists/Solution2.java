package com.zjxjwxk.leetcode._0021_Merge_Two_Sorted_Lists;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * 递归
 *
 * @author zjxjwxk
 */
public class Solution2 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            node = new ListNode(l1.val);
            l1 = l1.next;
        } else {
            node = new ListNode(l2.val);
            l2 = l2.next;
        }
        node.next = mergeTwoLists(l1, l2);
        return node;
    }
}
