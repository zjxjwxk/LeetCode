package com.zjxjwxk.leetcode._0725_Split_Linked_List_in_Parts;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * @author Xinkang Wu
 * @date 2021/9/22 16:23
 */
public class Solution {

    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = 0;
        for (ListNode p = head; p != null; p = p.next) {
            ++len;
        }
        int mainLen = len / k, extraLen = len % k;
        ListNode p = head;
        ListNode[] ans = new ListNode[k];
        for (int i = 0; i < k && p != null; ++i) {
            ans[i] = p;
            int subLen = mainLen;
            if (extraLen > 0) {
                ++subLen;
                --extraLen;
            }
            for (int j = 0; j < subLen - 1; ++j) {
                p = p.next;
            }
            ListNode newHead = p.next;
            p.next = null;
            p = newHead;
        }
        return ans;
    }
}
