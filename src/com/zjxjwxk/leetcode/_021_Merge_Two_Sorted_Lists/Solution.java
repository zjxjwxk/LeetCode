package com.zjxjwxk.leetcode._021_Merge_Two_Sorted_Lists;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

/**
 * @author zjxjwxk
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode temp = dummyHead;
        while (l1 != null && l2 != null){
            if (l1.val >= l2.val) {
                temp.next = new ListNode(l2.val);
                temp = temp.next;
                l2 = l2.next;
            } else {
                temp.next = new ListNode(l1.val);
                temp = temp.next;
                l1 = l1.next;
            }
        }
        if (l1 != null) {
            while (l1 != null) {
                temp.next = new ListNode(l1.val);
                l1 = l1.next;
                temp = temp.next;
            }
        } else if (l2 != null) {
            while (l2 != null) {
                temp.next = new ListNode(l2.val);
                l2 = l2.next;
                temp = temp.next;
            }
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(4);
        node2.next = new ListNode(3);
        node2.next.next = new ListNode(4);
        ListNode ret = new Solution().mergeTwoLists(node, node2);
        while (ret != null) {
            System.out.println(ret.val);
            ret = ret.next;
        }
    }
}