package com.zjxjwxk.leetcode._0347_Top_K_Frequent_Elements;

import java.util.*;

/**
 * 哈希表+最小堆
 * 时间复杂度：O(nlogk)
 * 空间复杂度：O(n)
 *
 * @author zjxjwxk
 */
public class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.merge(num, 1, Integer::sum);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((entry1, entry2) -> {
            return entry1.getValue() - entry2.getValue();
        });
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (minHeap.size() < k) {
                minHeap.offer(entry);
            } else if (entry.getValue() > minHeap.peek().getValue()) {
                minHeap.poll();
                minHeap.offer(entry);
            }
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; ++i) {
            ans[i] = minHeap.poll().getKey();
        }
        return ans;
    }
}