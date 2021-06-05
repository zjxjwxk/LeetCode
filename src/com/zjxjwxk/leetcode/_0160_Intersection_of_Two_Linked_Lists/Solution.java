package com.zjxjwxk.leetcode._0160_Intersection_of_Two_Linked_Lists;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * 双指针
 * @author Xinkang Wu
 * @date 2021/6/5 16:50
 */
public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode p = headA, q = headB;
        while (p != q) {
            if (p != null) {
                p = p.next;
            } else {
                p = headB;
            }
            if (q != null) {
                q = q.next;
            } else {
                q = headA;
            }
        }
        return p;
    }
}
