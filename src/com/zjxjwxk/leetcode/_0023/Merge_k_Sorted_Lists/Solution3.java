package com.zjxjwxk.leetcode._0023.Merge_k_Sorted_Lists;

import com.zjxjwxk.leetcode.util.ListNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列合并
 * 时间复杂度：O(kn * log(k))
 *
 * @author Xinkang Wu
 * @date 2025/7/8 20:45
 */
public class Solution3 {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        Queue<ListNode> queue = new LinkedList<>();
        for (ListNode list : lists) {
            queue.offer(list);
        }
        while (queue.size() > 1) {
            int size = queue.size();
            for (int i = 0; i < size; i += 2) {
                if (i == size - 1) {
                    queue.offer(queue.poll());
                    break;
                }
                ListNode head1 = queue.poll();
                ListNode head2 = queue.poll();
                queue.offer(merge(head1, head2));
            }
        }
        return queue.poll();
    }

    private ListNode merge(ListNode head1, ListNode head2) {
        ListNode p1 = head1, p2 = head2, dummyHead = new ListNode(0), tail = dummyHead;
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
        if (p1 != null) {
            tail.next = p1;
        } else if (p2 != null) {
            tail.next = p2;
        }
        return dummyHead.next;
    }
}
