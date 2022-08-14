package com.zjxjwxk.leetcode._0023.Merge_k_Sorted_Lists;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * 分治合并
 * 时间复杂度O(knlogk)
 *
 * @author Xinkang Wu
 * @date 2022/8/13 21:00
 */
public class Solution2 {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return merge(lists, 0, lists.length - 1);
    }

    private ListNode merge(ListNode[] lists, int left, int right) {
        if (left == right) {
            return lists[left];
        }
        int mid = left + ((right - left) >> 1);
        ListNode leftList = merge(lists, left, mid);
        ListNode rightList = merge(lists, mid + 1, right);
        return merge(leftList, rightList);
    }

    private ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        if (list1 != null) {
            tail.next = list1;
        } else if (list2 != null) {
            tail.next = list2;
        }
        return dummyHead.next;
    }
}
