package com.zjxjwxk.leetcode._1202_Smallest_String_With_Swaps;

import java.util.*;

/**
 * 并查集+堆
 * @author Xinkang Wu
 * @date 2021/1/11 14:03
 */
public class Solution {

    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        if (pairs.size() == 0) {
            return s;
        }
        int sLen = s.length();
        char[] charArr = s.toCharArray();
        int[] parent = new int[sLen];
        Map<Integer, Queue<Character>> indexHeapMap = new HashMap<>();
        for (int i = 0; i < sLen; ++i) {
            parent[i] = i;
        }
        for (List<Integer> pair : pairs) {
            int index1 = pair.get(0);
            int index2 = pair.get(1);
            union(parent, index1, index2);
        }
        for (int i = 0; i < sLen; ++i) {
            indexHeapMap.computeIfAbsent(findParent(parent, i), key -> new PriorityQueue<>()).offer(charArr[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sLen; ++i) {
            sb.append(indexHeapMap.get(findParent(parent, i)).poll());
        }
        return sb.toString();
    }

    private void union(int[] parent, int index1, int index2) {
        int parent1 = findParent(parent, index1);
        int parent2 = findParent(parent, index2);
        if (parent1 != parent2) {
            parent[parent1] = parent2;
        }
    }

    private int findParent(int[] parent, int index) {
        int root = index;
        while (root != parent[root]) {
            root = parent[root];
        }
        while (index != parent[index]) {
            int tempParent = parent[index];
            parent[index] = root;
            index = tempParent;
        }
        return index;
    }
}
