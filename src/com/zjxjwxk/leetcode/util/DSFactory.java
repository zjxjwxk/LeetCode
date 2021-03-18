package com.zjxjwxk.leetcode.util;

import java.util.*;

/**
 * 数据结构工厂类
 * @author zjxjwxk
 * @date 2020/10/13 9:11 上午
 */
public class DSFactory {

    public static <T> List<List<T>> newArrayList(T[][] arr) {
        List<List<T>> arrayList = new ArrayList<>();
        for (T[] arr1 : arr) {
            List<T> list = new ArrayList<>(Arrays.asList(arr1));
            arrayList.add(list);
        }
        return arrayList;
    }

    public static ListNode newLinkedList(int[] arr) {
        ListNode dummyHead = new ListNode(), temp = dummyHead;
        for (int val : arr) {
            temp.next = new ListNode(val);
            temp = temp.next;
        }
        return dummyHead.next;
    }

    public static TreeNode newTree(Integer[] arr) {
        if (arr.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(arr[0]);
        int index = 1, len = arr.length;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty() && index < len) {
            TreeNode node = queue.poll();
            if (arr[index] != null) {
                node.left = new TreeNode(arr[index]);
                queue.offer(node.left);
            }
            ++index;
            if (index < len && arr[index] != null) {
                node.right = new TreeNode(arr[index]);
                queue.offer(node.right);
            }
            ++index;
        }
        return root;
    }

    public static ListNode newListNode(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        ListNode dummyHead = new ListNode(), p = dummyHead;
        for (int num : arr) {
            p.next = new ListNode(num);
            p = p.next;
        }
        return dummyHead.next;
    }
}
