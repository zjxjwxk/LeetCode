package com.zjxjwxk.leetcode._0692_Top_K_Frequent_Words;

import java.util.*;

/**
 * 哈希表+最小堆
 * @author Xinkang Wu
 * @date 2021/5/20 21:38
 */
public class Solution2 {

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String word : words) {
            countMap.merge(word, 1, Integer::sum);
        }
        Queue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<>(k + 1, (entry1, entry2) -> {
            if (!entry1.getValue().equals(entry2.getValue())) {
                return entry1.getValue() - entry2.getValue();
            }
            return entry2.getKey().compareTo(entry1.getKey());
        });
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        List<String> ans = new ArrayList<>(k);
        while (!minHeap.isEmpty()) {
            ans.add(minHeap.poll().getKey());
        }
        Collections.reverse(ans);
        return ans;
    }
}
