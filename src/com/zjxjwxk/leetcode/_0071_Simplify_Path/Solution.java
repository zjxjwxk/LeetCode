package com.zjxjwxk.leetcode._0071_Simplify_Path;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 双向队列
 *
 * @author Xinkang Wu
 * @date 2026/1/28 00:15
 */
public class Solution {

    public String simplifyPath(String path) {
        Deque<String> deque = new LinkedList<>();
        String[] items = path.split("/");
        for (String item : items) {
            if ("..".equals(item)) {
                if (!deque.isEmpty()) {
                    deque.pollLast();
                }
            } else if (!item.isEmpty() && !".".equals(item)) {
                deque.offerLast(item);
            }
        }
        if (deque.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            sb.append('/');
            sb.append(deque.pollFirst());
        }
        return sb.toString();
    }
}
