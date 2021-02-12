package com.zjxjwxk.leetcode._0703_Kth_Largest_Element_in_a_Stream;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 堆
 * @author Xinkang Wu
 * @date 2021/2/11 21:33
 */
public class KthLargest {

    private final Queue<Integer> minHeap;
    private final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>(k);
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (minHeap.size() < k) {
            minHeap.offer(val);
        } else if (val >= minHeap.peek()) {
            minHeap.offer(val);
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
