package com.zjxjwxk.leetcode._0786_K_th_Smallest_Prime_Fraction;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 归并+优先队列
 * 时间复杂度O(klogn)
 * 空间复杂度O(n)
 * @author Xinkang Wu
 * @date 2021/11/29 14:34
 */
public class Solution2 {

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        Queue<int[]> minHeap = new PriorityQueue<>(k, (index1, index2) -> arr[index1[0]] * arr[index2[1]] - arr[index1[1]] * arr[index2[0]]);
        int len = arr.length;
        for (int i = 1; i < len; ++i) {
            minHeap.offer(new int[]{0, i});
        }
        for (int i = 0; i < k - 1; ++i) {
            int[] index = minHeap.poll();
            if (index[0] + 1 < index[1]) {
                minHeap.offer(new int[]{index[0] + 1, index[1]});
            }
        }
        return new int[]{arr[minHeap.peek()[0]], arr[minHeap.peek()[1]]};
    }
}