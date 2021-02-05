package com.zjxjwxk.leetcode._0480_Sliding_Window_Median;

import java.util.*;

/**
 * 双优先队列 + 延迟删除
 * @author Xinkang Wu
 * @date 2021/2/3 13:30
 */
public class Solution {

    public double[] medianSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        DualHeap dualHeap = new DualHeap();
        double[] ans = new double[len - k + 1];
        for (int i = 0; i < k; ++i) {
            dualHeap.insert(nums[i]);
        }
        ans[0] = dualHeap.getMid();
        for (int i = k; i < len; ++i) {
            dualHeap.erase(nums[i - k]);
            dualHeap.insert(nums[i]);
            ans[i - k + 1] = dualHeap.getMid();
        }
        return ans;
    }

    static class DualHeap {
        private final Queue<Integer> maxHeap;
        private final Queue<Integer> minHeap;

        private final Map<Integer, Integer> delayMap;

        private int maxSize;
        private int minSize;

        public DualHeap() {
            maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
            minHeap = new PriorityQueue<>();
            delayMap = new HashMap<>();
            maxSize = 0;
            minSize = 0;
        }

        public void insert(int num) {
            if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
                maxHeap.offer(num);
                ++maxSize;
            } else {
                minHeap.offer(num);
                ++minSize;
            }
            balance();
        }

        public void balance() {
            int diff = maxSize - minSize;
            if (diff == 2) {
                minHeap.offer(maxHeap.poll());
                ++minSize;
                --maxSize;
                prune(maxHeap);
            }
            if (diff == -1) {
                maxHeap.offer(minHeap.poll());
                ++maxSize;
                --minSize;
                prune(minHeap);
            }
        }

        public void erase(int num) {
            delayMap.put(num, delayMap.getOrDefault(num, 0) + 1);
            if (!maxHeap.isEmpty() && num <= maxHeap.peek()) {
                --maxSize;
                if (num == maxHeap.peek()) {
                    prune(maxHeap);
                }
            } else if (!minHeap.isEmpty() && num >= minHeap.peek()) {
                --minSize;
                if (num == minHeap.peek()) {
                    prune(minHeap);
                }
            }
            balance();
        }

        public void prune(Queue<Integer> heap) {
            while (!heap.isEmpty() && delayMap.containsKey(heap.peek())) {
                int topNum = heap.poll();
                int topCount = delayMap.get(topNum) - 1;
                delayMap.put(topNum, topCount);
                if (topCount == 0) {
                    delayMap.remove(topNum);
                }
            }
        }

        public double getMid() {
            if (maxSize == minSize) {
                return ((double) maxHeap.peek() + minHeap.peek()) / 2;
            }
            return maxHeap.peek();
        }
    }
}
