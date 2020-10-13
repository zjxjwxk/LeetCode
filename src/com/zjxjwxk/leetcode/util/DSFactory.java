package com.zjxjwxk.leetcode.util;

/**
 * @author zjxjwxk
 * @date 2020/10/13 9:11 上午
 */
public class DSFactory {

    public static ListNode newLinkedList(int[] arr) {
        ListNode dummyHead = new ListNode(), temp = dummyHead;
        for (int val : arr) {
            temp.next = new ListNode(val);
            temp = temp.next;
        }
        return dummyHead.next;
    }
}
