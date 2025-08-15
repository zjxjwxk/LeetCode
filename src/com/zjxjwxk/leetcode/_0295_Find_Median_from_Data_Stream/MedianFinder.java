package com.zjxjwxk.leetcode._0295_Find_Median_from_Data_Stream;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 最大堆+最小堆
 * 时间复杂度：
 *  addNum：O(logn)
 *  findMedian：O(1)
 * 空间复杂度：O(n)
 *
 * @author Xinkang Wu
 * @date 2020/10/19 2:19 下午
 */
public class MedianFinder {

    private final Queue<Integer> maxHeap;
    private final Queue<Integer> minHeap;

    public MedianFinder() {
        this.maxHeap = new PriorityQueue<>((num1, num2) -> num2 - num1);
        this.minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (this.maxHeap.isEmpty() || num <= this.maxHeap.peek()) {
            this.maxHeap.offer(num);
            if (this.maxHeap.size() > this.minHeap.size() + 1) {
                this.minHeap.offer(this.maxHeap.poll());
            }
        } else {
            this.minHeap.offer(num);
            if (this.minHeap.size() > this.maxHeap.size()) {
                this.maxHeap.offer(this.minHeap.poll());
            }
        }
    }

    public double findMedian() {
        if (this.maxHeap.size() == this.minHeap.size()) {
            return ((double) (this.maxHeap.peek() + this.minHeap.peek())) / 2;
        } else {
            return this.maxHeap.peek();
        }
    }
}
