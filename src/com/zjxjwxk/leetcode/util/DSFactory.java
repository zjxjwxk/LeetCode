package com.zjxjwxk.leetcode.util;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 数据结构工厂类
 * @author zjxjwxk
 * @date 2020/10/13 9:11 上午
 */
public class DSFactory {

    public static List<List<Integer>> newArrayList(int[][] arr) {
        List<List<Integer>> arrayList = new ArrayList<>();
        for (int[] arr1 : arr) {
            List<Integer> list = new ArrayList<>();
            for (int num : arr1) {
                list.add(num);
            }
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
}
