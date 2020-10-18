package com.zjxjwxk.leetcode._0019_Remove_Nth_Node_From_End_of_List;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * @author Xinkang Wu
 * @date 2020/10/18 9:31 上午
 */
public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(), ahead = head, behind = dummyHead;
        dummyHead.next = head;
        while (n-- != 0) {
            ahead = ahead.next;
        }
        while (ahead != null) {
            ahead = ahead.next;
            behind = behind.next;
        }
        behind.next = behind.next.next;
        return dummyHead.next;
    }
}
