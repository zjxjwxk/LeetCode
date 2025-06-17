package com.zjxjwxk.leetcode._0142_Linked_List_Cycle_II;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * 快慢指针
 * 快慢指针相遇时，慢指针走过x，快指针走过2x，
 * 此时将一新慢指针从头开始和老慢指针同时继续走，
 * 当老慢指针走过2x时，新慢指针走过x，此时新老
 * 慢指针必定相遇在之前快慢指针的相遇点。由于两
 * 慢指针速度一致，故必定在入环处第一次相遇。
 *
 * @author Xinkang Wu
 * @date 2025/6/17 20:33
 */
public class Solution2 {

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        ListNode newSlow = head;
        while (newSlow != slow) {
            newSlow = newSlow.next;
            slow = slow.next;
        }
        return slow;
    }
}
