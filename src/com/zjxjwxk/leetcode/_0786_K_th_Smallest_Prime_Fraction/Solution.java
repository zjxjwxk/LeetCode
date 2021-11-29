package com.zjxjwxk.leetcode._0786_K_th_Smallest_Prime_Fraction;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 暴力优先队列
 * 时间复杂度O((n^2)logk)
 * 空间复杂度O(k)
 * @author Xinkang Wu
 * @date 2021/11/29 14:34
 */
public class Solution {

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        Queue<int[]> maxHeap = new PriorityQueue<>(k + 1, (num1, num2) -> Double.compare(num1[1] * num2[0], num1[0] * num2[1]));
        for (int i = 0; i < arr.length; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                maxHeap.offer(new int[]{arr[i], arr[j]});
                if (maxHeap.size() == k + 1) {
                    maxHeap.poll();
                }
            }
        }
        return maxHeap.poll();
    }
}