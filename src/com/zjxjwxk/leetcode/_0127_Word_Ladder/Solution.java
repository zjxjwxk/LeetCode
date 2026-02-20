package com.zjxjwxk.leetcode._0127_Word_Ladder;

import java.util.*;

/**
 * BFS
 *
 * @author Xinkang Wu
 * @date 2020/11/5 7:34 下午
 */
public class Solution {

    private final Map<String, List<String>> graphMap = new HashMap<>();

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        for (String word : wordList) {
            addWord(word);
        }
        addWord(beginWord);
        if (!graphMap.containsKey(endWord)) {
            return 0;
        }
        Queue<String> queue = new LinkedList<>();
        Set<String> visitedSet = new HashSet<>();
        queue.offer(beginWord);
        visitedSet.add(beginWord);
        int count = 0;
        while (!queue.isEmpty()) {
            ++count;
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                String word = queue.poll();
                for (String next : graphMap.get(word)) {
                    if (next.equals(endWord)) {
                        return (count >> 1) + 1;
                    }
                    if (!visitedSet.contains(next)) {
                        queue.offer(next);
                        visitedSet.add(next);
                    }
                }
            }
        }
        return 0;
    }

    private void addWord(String word) {
        if (graphMap.containsKey(word)) {
            return;
        }
        char[] chArr = word.toCharArray();
        for (int i = 0; i < chArr.length; ++i) {
            char ch = chArr[i];
            chArr[i] = '*';
            String patternWord = new String(chArr);
            addEdge(word, patternWord);
            addEdge(patternWord, word);
            chArr[i] = ch;
        }
    }

    private void addEdge(String word1, String word2) {
        List<String> edgeList = graphMap.get(word1);
        if (edgeList == null) {
            edgeList = new ArrayList<>();
        }
        edgeList.add(word2);
        graphMap.put(word1, edgeList);
    }
}
