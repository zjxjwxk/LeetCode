package com.zjxjwxk.leetcode._0295_Find_Median_from_Data_Stream;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Xinkang Wu
 * @date 2020/10/19 2:19 下午
 */
public class MedianFinder {

    private final Queue<Integer> minHeap;
    private final Queue<Integer> maxHeap;
    /** initialize your data structure here. */

    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
    }

    public void addNum(int num) {
        if (maxHeap.size() == 0) {
            maxHeap.add(num);
        } else {
            if (num < maxHeap.peek()) {
                maxHeap.add(num);
            } else {
                minHeap.add(num);
            }
        }
        int difference = maxHeap.size() - minHeap.size();
        if (difference > 1) {
            minHeap.add(maxHeap.poll());
        } else if (difference < 0) {
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else {
            return maxHeap.peek();
        }
    }
}
