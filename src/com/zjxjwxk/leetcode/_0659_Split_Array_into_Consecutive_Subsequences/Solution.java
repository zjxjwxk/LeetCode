package com.zjxjwxk.leetcode._0659_Split_Array_into_Consecutive_Subsequences;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 哈希表 + 最小堆
 * @author Xinkang Wu
 * @date 2020/12/4 15:20
 */
public class Solution {

    public boolean isPossible(int[] nums) {
        Map<Integer, Queue<Integer>> map = new HashMap<>();
        for (int num : nums) {
            Queue<Integer> minHeap = map.get(num - 1);
            if (minHeap != null && minHeap.size() != 0) {
                Integer length = minHeap.poll();
                map.putIfAbsent(num, new PriorityQueue<>());
                map.get(num).add(length + 1);
            } else {
                map.putIfAbsent(num, new PriorityQueue<>());
                map.get(num).add(1);
            }
        }
        for (Queue<Integer> maxHeap : map.values()) {
            if (maxHeap.size() != 0 && maxHeap.peek() < 3) {
                return false;
            }
        }
        return true;
    }
}
