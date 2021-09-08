package com.zjxjwxk.leetcode._0502_IPO;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 利用堆的贪心算法
 * @author Xinkang Wu
 * @date 2021/9/8 11:32
 */
public class Solution {

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int len = profits.length, index = 0;
        int[][] arr = new int[len][2];
        for (int i = 0; i < len; ++i) {
            arr[i][0] = capital[i];
            arr[i][1] = profits[i];
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < k; ++i) {
            while (index < len && arr[index][0] <= w) {
                maxHeap.offer(arr[index][1]);
                ++index;
            }
            if (!maxHeap.isEmpty()) {
                w += maxHeap.poll();
            } else {
                break;
            }
        }
        return w;
    }
}
