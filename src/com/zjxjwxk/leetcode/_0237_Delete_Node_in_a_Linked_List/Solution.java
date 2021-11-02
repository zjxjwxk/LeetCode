package com.zjxjwxk.leetcode._0237_Delete_Node_in_a_Linked_List;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * 和下一个节点交换
 * @author Xinkang Wu
 * @date 2021/11/2 18:42
 */
public class Solution {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        ListNode next = node.next;
        node.next = next.next;
        next.next = null;
    }
}
