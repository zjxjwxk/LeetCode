package com.zjxjwxk.leetcode._1046_Last_Stone_Weight;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 最大堆
 * @author Xinkang Wu
 * @date 2020/12/30 21:57
 */
public class Solution {

    public int lastStoneWeight(int[] stones) {
        Queue<Integer> heap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int stone : stones) {
            heap.offer(stone);
        }
        while (heap.size() >= 2) {
            int stone1 = heap.poll();
            int stone2 = heap.poll();
            if (stone1 > stone2) {
                heap.offer(stone1 - stone2);
            }
        }
        return heap.isEmpty() ? 0 : heap.peek();
    }
}
