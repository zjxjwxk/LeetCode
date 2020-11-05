package com.zjxjwxk.leetcode._0127_Word_Ladder;

import java.util.*;

/**
 * @author Xinkang Wu
 * @date 2020/11/5 7:34 下午
 */
public class Solution {

    private final Map<String, Integer> map = new HashMap<>();
    private final List<List<Integer>> graph = new ArrayList<>();
    private boolean[] vis;
    private int index = 0;

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        for (String word : wordList) {
            addEdge(word);
        }
        addEdge(beginWord);
        if (!map.containsKey(endWord)) {
            return 0;
        }
        int beginIndex = map.get(beginWord), endIndex = map.get(endWord);
        vis = new boolean[graph.size()];
        return bfs(beginIndex, endIndex);
    }

    private int bfs(int beginIndex, int endIndex) {
        Deque<Integer> queue = new LinkedList<>();
        queue.offer(beginIndex);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            ++level;
            for (int i = 0; i < size; ++i) {
                Integer index = queue.poll();
                if (index == endIndex) {
                    return (level >> 1) + 1;
                }
                for (Integer next : graph.get(index)) {
                    if (!vis[next]) {
                        queue.offer(next);
                        vis[next] = true;
                    }
                }
            }
        }
        return 0;
    }

    private void addEdge(String word) {
        addNode(word);
        char[] chArr = word.toCharArray();
        int len = chArr.length, index1 = map.get(word), index2;
        char temp;
        for (int i = 0; i < len; ++i) {
            temp = chArr[i];
            chArr[i] = '*';
            String midWord = new String(chArr);
            addNode(midWord);
            index2 = map.get(midWord);
            graph.get(index1).add(index2);
            graph.get(index2).add(index1);
            chArr[i] = temp;
        }
    }

    private void addNode(String word) {
        if (!map.containsKey(word)) {
            map.put(word, index++);
            graph.add(new ArrayList<>());
        }
    }
}
