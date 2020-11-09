package com.zjxjwxk.leetcode._0973_K_Closest_Points_to_Origin;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 大根堆
 * @author Xinkang Wu
 * @date 2020/11/9 6:59 下午
 */
public class Solution {

    public int[][] kClosest(int[][] points, int K) {
        Queue<int[]> heap = new PriorityQueue<>((o1, o2) -> o2[0] - o1[0]);
        for (int i = 0; i < K; ++i) {
            heap.add(new int[]{points[i][0] * points[i][0] + points[i][1] * points[i][1], i});
        }
        for (int i = K; i < points.length; ++i) {
            int dis = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            if (dis < heap.peek()[0]) {
                heap.poll();
                heap.offer(new int[]{dis, i});
            }
        }
        int[][] ans = new int[K][2];
        for (int i = 0; i < K; ++i) {
            ans[i] = points[heap.poll()[1]];
        }
        return ans;
    }
}
