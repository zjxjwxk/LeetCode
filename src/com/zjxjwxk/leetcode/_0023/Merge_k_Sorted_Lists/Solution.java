package com.zjxjwxk.leetcode._0023.Merge_k_Sorted_Lists;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * 逐个合并
 * 时间复杂度O(nk^2)
 *
 * @author Xinkang Wu
 * @date 2022/8/13 21:00
 */
public class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummyHead = new ListNode();
        ListNode p = dummyHead;
        int len = lists.length;
        boolean finish = false;
        while (!finish) {
            ListNode minNode = new ListNode(Integer.MAX_VALUE);
            int minIndex = -1;
            finish = true;
            for (int i = 0; i < len; ++i) {
                ListNode node = lists[i];
                if (node != null) {
                    finish = false;
                    if (node.val < minNode.val) {
                        minNode = node;
                        minIndex = i;
                    }
                }
            }
            if (!finish) {
                lists[minIndex] = minNode.next;
                minNode.next = null;
                p.next = minNode;
                p = p.next;
            }
        }
        return dummyHead.next;
    }
}
