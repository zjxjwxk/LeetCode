package com.zjxjwxk.leetcode._1005_Maximize_Sum_Of_Array_After_K_Negations;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 最小堆
 * 时间复杂度O(nlogn)
 * 空间复杂度O(n)
 * @author Xinkang Wu
 * @date 2021/12/3 14:47
 */
public class Solution {

    public int largestSumAfterKNegations(int[] nums, int k) {
        int len = nums.length, sum = 0;
        Queue<Integer> minHeap = new PriorityQueue<>(len);
        for (int num : nums) {
            minHeap.offer(num);
            sum += num;
        }
        for (int i = 0; i < k; ++i) {
            int min = minHeap.poll();
            minHeap.offer(-min);
            sum -= (min << 1);
        }
        return sum;
    }
}
