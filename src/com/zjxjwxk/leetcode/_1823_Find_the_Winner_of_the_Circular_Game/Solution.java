package com.zjxjwxk.leetcode._1823_Find_the_Winner_of_the_Circular_Game;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列
 *
 * @author Xinkang Wu
 * @date 2025/11/20 22:28
 */
public class Solution {

    public int findTheWinner(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; ++i) {
            queue.offer(i);
        }
        while (queue.size() > 1) {
            for (int i = 0; i < k - 1; ++i) {
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        return queue.peek();
    }
}
