package com.zjxjwxk.leetcode._0138_Copy_List_with_Random_Pointer;

import java.util.HashMap;
import java.util.Map;

/**
 * 回溯 + 哈希表
 * @author Xinkang Wu
 * @date 2021/7/25 22:47
 */
public class Solution2 {

    Map<Node, Node> cachedMap = new HashMap<>();

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node node = cachedMap.get(head);
        if (node != null) {
            return node;
        }
        Node newHead = new Node(head.val);
        cachedMap.put(head, newHead);
        newHead.next = copyRandomList(head.next);
        newHead.random = copyRandomList(head.random);
        return newHead;
    }
}
