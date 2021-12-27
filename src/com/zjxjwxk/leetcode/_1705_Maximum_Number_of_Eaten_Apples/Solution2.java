package com.zjxjwxk.leetcode._1705_Maximum_Number_of_Eaten_Apples;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 贪心+优先队列
 * @author Xinkang Wu
 * @date 2021/12/27 23:29
 */
public class Solution2 {

    public int eatenApples(int[] apples, int[] days) {
        int n = apples.length, curDay, ans = 0;
        Queue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        for (curDay = 0; curDay < n; ++curDay) {
            while (!minHeap.isEmpty() && minHeap.peek()[0] <= curDay) {
                minHeap.poll();
            }
            if (apples[curDay] > 0) {
                minHeap.offer(new int[]{curDay + days[curDay], apples[curDay]});
            }
            if (!minHeap.isEmpty()) {
                int[] first = minHeap.peek();
                if (--first[1] == 0) {
                    minHeap.poll();
                }
                ++ans;
            }
        }
        while (!minHeap.isEmpty()) {
            while (!minHeap.isEmpty() && minHeap.peek()[0] <= curDay) {
                minHeap.poll();
            }
            if (minHeap.isEmpty()) {
                break;
            }
            int[] first = minHeap.poll();
            int addDay = Math.min(first[0] - curDay, first[1]);
            ans += addDay;
            curDay += addDay;
        }
        return ans;
    }
}
