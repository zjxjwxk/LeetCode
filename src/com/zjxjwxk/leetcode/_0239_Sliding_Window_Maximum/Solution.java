package com.zjxjwxk.leetcode._0239_Sliding_Window_Maximum;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 最大堆
 * @author Xinkang Wu
 * @date 2021/1/2 14:22
 */
public class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int[] ans = new int[len - k + 1];
        Queue<Integer> maxHeap = new PriorityQueue<>(k, (index1, index2) -> nums[index1] != nums[index2] ? nums[index2] - nums[index1] : index1 - index2);
        for (int i = 0; i < k; ++i) {
            maxHeap.offer(i);
        }
        ans[0] = nums[maxHeap.peek()];
        for (int i = 1; i <= len - k; ++i) {
            maxHeap.offer(i + k - 1);
            while (maxHeap.peek() < i) {
                maxHeap.poll();
            }
            ans[i] = nums[maxHeap.peek()];
        }
        return ans;
    }
}
