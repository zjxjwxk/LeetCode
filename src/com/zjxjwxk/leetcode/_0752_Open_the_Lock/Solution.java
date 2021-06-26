package com.zjxjwxk.leetcode._0752_Open_the_Lock;

import java.util.*;

/**
 * 广度优先搜索
 * @author Xinkang Wu
 * @date 2021/6/25 16:47
 */
public class Solution {

    public int openLock(String[] deadends, String target) {
        String initial = "0000";
        if (initial.equals(target)) {
            return 0;
        }
        Set<String> deadSet = new HashSet<>();
        Collections.addAll(deadSet, deadends);
        if (deadSet.contains(initial)) {
            return -1;
        }
        Set<String> visitedSet = new HashSet<>();
        visitedSet.add(initial);
        Queue<String> queue = new LinkedList<>();
        queue.offer(initial);
        int step = 0;
        while (!queue.isEmpty()) {
            ++step;
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                for (String nextStr : getNextLevel(queue.poll())) {
                    if (!deadSet.contains(nextStr) && !visitedSet.contains(nextStr)) {
                        if (nextStr.equals(target)) {
                            return step;
                        }
                        queue.offer(nextStr);
                        visitedSet.add(nextStr);
                    }
                }
            }
        }
        return -1;
    }

    private List<String> getNextLevel(String cur) {
        List<String> nextLevel = new ArrayList<>(8);
        char[] curChArr = cur.toCharArray();
        for (int i = 0; i < 4; ++i) {
            char num = curChArr[i];
            curChArr[i] = num == '9' ? '0' : (char) (num + 1);
            nextLevel.add(new String(curChArr));
            curChArr[i] = num == '0' ? '9' : (char) (num - 1);
            nextLevel.add(new String(curChArr));
            curChArr[i] = num;
        }
        return nextLevel;
    }
}
